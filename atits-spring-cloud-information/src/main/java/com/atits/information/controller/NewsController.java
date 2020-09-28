package com.atits.information.controller;

import com.atits.information.client.NewsClient;
import com.atits.security.client.AccountClient;
import com.atits.security.model.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-08 16:54
 **/
@RestController
public class NewsController implements NewsClient {

    @Autowired
    AccountClient accountClient;

    @Override
    public String test(){
        UserEntity userEntity = new UserEntity();
        userEntity.setLoginPassword("pppp");
        userEntity.setLoginUsername("uuu");
        String result = accountClient.get(userEntity);
        return "Invoke : " + accountClient + ", return : " + result;
    }

    @Override
    public String test2(){
        return "Invoke success";
    }


}
