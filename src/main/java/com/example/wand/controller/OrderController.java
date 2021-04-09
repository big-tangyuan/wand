package com.example.wand.controller;

import com.example.wand.pojo.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @Author TangZT
 */
// 使用@Slf4j在运行期创建一个SLF4J Logger对象
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model){
        model.addAttribute("order", new Order());
        return "orderForm";
    }
    @PostMapping
    public String processOrder(@Valid Order order, Errors errors) {
        if(errors.hasErrors()){
            return "orderForm";
        }
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
