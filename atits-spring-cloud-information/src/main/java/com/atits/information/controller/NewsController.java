package com.atits.information.controller;

import com.atits.information.client.information.TestClient;
import com.atits.information.client.security.AccountClient;
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
@RequestMapping("/news")
public class NewsController {

    @Autowired
    AccountClient accountClient;

    @Autowired
    TestClient testClient;

    @GetMapping("/test")
    public String test(Authentication authentication){
        String result = accountClient.get("zhangys");
        return "Invoke : " + accountClient + ", return : " + result;
//        Object details = authentication.getDetails();
//        System.out.println(details);
//        return "1111111111111";
    }

    @GetMapping("/test2")
    public String test2(){
        return "Invoke success";
    }


}
