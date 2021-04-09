package com.example.wand.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Author TangZT
 */
//@Data 由lombok提供，生成所有缺失的方法以及final属性参数的构造器
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public static enum Type{
        material, decorate, property
    }
}
