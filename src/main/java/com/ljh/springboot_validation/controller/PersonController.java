package com.ljh.springboot_validation.controller;

import com.ljh.springboot_validation.excception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liu, jihong
 * @version 1.0
 * @date 2019-09-10 下午 5:34
 */
@RestController
public class PersonController {
    @RequestMapping("/hello")
    public String hello() {
       throw new BusinessException("1","密码长度低于5");
    }
}
