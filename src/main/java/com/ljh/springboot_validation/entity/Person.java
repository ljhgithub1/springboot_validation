package com.ljh.springboot_validation.entity;

import lombok.Data;
import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Liu, jihong
 * @version 1.0
 * @date 2019-09-10 下午 2:45
 */

/**
 * validation校验框架中常用的注解
 * @NotNull  不能为空
 * @Null  为空
 * @NotEmpty :不能为null，且Size>0
 * @NotBlank: 只用于String,不能为null且trim()之后size>0
 * @Size 限定长度
 * @Min 限定最小值
 * @Max 限定最大值
 */
@Data//有这个注解就可以对实体类提供读写还包含toString，hashCode，equals方法
public class Person {
    @NotNull(message = "用户名不能为空")//这是validation中的注解校验这个属性不能为空
    private String name;
    @Size(min = 5,max = 10,message = "密码长度超过10")
    private String password;
}
