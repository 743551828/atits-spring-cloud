package com.atits.information.controller;

import com.atits.security.client.AccountClient;
import com.atits.security.model.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-08 16:54
 **/
@RestController
public class NewsController {

    @Autowired
    AccountClient accountClient;

    @GetMapping("/test")
    public String test(){
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginPassword("pppp");
        userEntity.setLoginUsername("uuu");
        String result = accountClient.get(userEntity);
        return "Invoke : " + accountClient + ", return : " + result;
    }

    @GetMapping("/test2")
    public String test2(){
        return "Invoke success";
    }


}
