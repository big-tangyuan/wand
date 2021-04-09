package com.example.wand.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @Author TangZT
 */
@Data
public class Order {
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "街道不能为空")
    private String street;
    @NotBlank(message = "城市不能为空")
    private String city;
    @NotBlank(message = "国家不能为空")
    private String state;
    @NotBlank(message = "邮编不能为空")
    private String zip;
    @CreditCardNumber(message = "请填入合法的卡号")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
    message = "日期格式必须为 月/日")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;
}
