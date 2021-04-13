package com.example.wand.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author TangZT
 */
// @Data使得在编译期自动生成必要的JavaBean方法
@Data
//@Entity
public class Wand implements Serializable{
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //@NotNull
    private Date createdAt;
    @Size(min = 2, message = "名称长度必须大于2个字符")
    private String name;
    //@ManyToMany(targetEntity = Ingredient.class)
    @Size(min = 1, message = "至少要选择一项材料")
    private List<String> ingredients;
    //在Taco持久化之前，使用该方法将createdAt设置为当前的日期和时间
    //@PrePersist
    void createdAt(){
        this.createdAt = new Date();
    }

}
