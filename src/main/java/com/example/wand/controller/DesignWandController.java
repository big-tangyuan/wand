package com.example.wand.controller;

import com.example.wand.pojo.Ingredient;
import com.example.wand.pojo.Wand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author TangZT
 */
// @Slf4j 是lombok提供的注解，运行时在类中自动生成SLF4J logger
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignWandController {
    @GetMapping
    public String showWandForm(Model model){
        // 硬编码的ingredients对象列表
        //根据材质类型过滤列表
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("m_gold", "黄金材质", Ingredient.Type.material),
                new Ingredient("m_silver", "白银材质", Ingredient.Type.material),
                new Ingredient("m_platinum", "铂金材质", Ingredient.Type.material),
                new Ingredient("m_wood", "橡木材质", Ingredient.Type.material),
                new Ingredient("d_feather", "羽毛", Ingredient.Type.decorate),
                new Ingredient("d_horn", "独角兽的角", Ingredient.Type.decorate),
                new Ingredient("d_foot", "幸运兔脚", Ingredient.Type.decorate),
                new Ingredient("p_wind", "风", Ingredient.Type.property),
                new Ingredient("p_thunder", "雷", Ingredient.Type.property),
                new Ingredient("p_ice", "冰", Ingredient.Type.property)
        );
        Ingredient.Type[] types = Ingredient.Type.values();
        // model负责在控制器与视图之间传递数据
        // 放到model属性中的数据会复制到 Servlet Response属性中， 以便被视图找到
        for(Ingredient.Type type : types){
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
        model.addAttribute("design", new Wand());
        return "design"; //design是视图的逻辑名称，用于将模型渲染到视图上
    }
    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type){
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }

    @PostMapping
    public String processDesign(@Valid Wand design, Errors errors) {
        if(errors.hasErrors()){
            return "design";
        }
        log.info("Processsing design:" + design);
        return "redirect:/orders/current";  //重定向到相对路径
    }

}
