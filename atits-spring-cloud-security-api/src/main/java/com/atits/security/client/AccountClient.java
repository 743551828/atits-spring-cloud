package com.atits.security.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 账户controller
 * @author: zhangys
 * @create: 2020-09-08 13:30
 **/
@FeignClient("atits-spring-cloud-security")
public interface AccountClient{

    /**
     * test
     *
     * @param test
     * @return
     */
    @GetMapping("/get")
    String get(@RequestParam String test);


}
