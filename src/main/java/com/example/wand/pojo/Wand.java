package com.example.wand.pojo;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.List;

/**
 * @Author TangZT
 */
// @Data使得在编译期自动生成必要的JavaBean方法
@Data
public class Wand {
    @NotNull
    @Size(min = 2, message = "名称长度必须大于2个字符")
    private String name;
    @Size(min = 1, message = "至少要选择一项材料")
    private List<String> ingredients;

}
