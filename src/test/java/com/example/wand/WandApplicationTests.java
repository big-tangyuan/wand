package com.example.wand;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wand.mapper.IngredientMapper;
import com.example.wand.pojo.Ingredient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/*
@SpringBootTest
class WandApplicationTests {

    @Test
    void contextLoads() {
    }

}

 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WandApplicationTests {

    @Autowired(required = false)
    private IngredientMapper ingredientMapper;

    @Test
    public void contextLoads(){

        /*
        //删除数据
        Ingredient ingredient = new Ingredient();
        ingredient.setId("11");
        ingredientMapper.deleteById(ingredient);
         */

        /*
        //更新数据
        Ingredient ingredient = new Ingredient();
        ingredient.setId("11");
        ingredient.setName("测试");
        ingredientMapper.updateById(ingredient);
         */

        /*
        //根据内容模糊查询，使用QueryWrapper条件构造器进行条件查询
        QueryWrapper<Ingredient> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","plus");
        List<Ingredient> ingredients = ingredientMapper.selectList(queryWrapper);
        for(Ingredient ingredient:ingredients){
            System.out.println(ingredient.getName());
        }
         */

        /*
        //根据id查询
        Ingredient ingredient = ingredientMapper.selectById(11);
        System.out.println(ingredient.getName());
         */
        /*
        //插入数据
        Ingredient ingredient = new Ingredient();
        ingredient.setId("1i3i");
        ingredient.setName("golden");
        ingredient.setType(Ingredient.Type.material);
        ingredientMapper.insert(ingredient);
         */
    }
}
