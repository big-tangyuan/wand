package com.example.wand.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jdk.internal.util.xml.impl.Input;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.UUID;


/**
 * @Author TangZT
 */
//@Data 由lombok提供，生成所有缺失的方法以及final属性参数的构造器
@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
//@Entity 将Ingredient声明为JPA实体
//@Entity
public class Ingredient implements Serializable {
    //@Id  //指定为数据库中唯一标识该实体的属性
    @TableId(type = IdType.UUID)
    private String id;
    private String name;
    private Type type;
    public enum Type{
        material, decorate, property
    }
    public Ingredient(String id, String name, Type type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
