package com.atits.evaluation.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-21 14:38
 **/
@RestController
public class Test {

    @GetMapping("test")
    public String test(){
        return "成功";
    }

}
