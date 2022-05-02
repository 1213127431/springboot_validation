package com.ti.model.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 用户实体类
 *
 * @author tangjie
 * @version 0.0.1
 * @since 2022/5/2 21:34
 **/
@Data
public class User {

    private Integer id;

    private String name;

    @NotNull(message = "年龄不能为空")
    @Min(value = 1, message = "年龄不能小于1岁")
    private Integer age;

    @NotBlank(message = "地址不能为空")
    private String address;
}
