package com.atits.information.controller;

import com.atits.information.client.security.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-08 16:54
 **/
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    AccountClient accountClient;

    @GetMapping("/test")
    public String test(){
        String result = accountClient.get("zhangys");
        return "Invoke : " + accountClient + ", return : " + result;
    }


}
