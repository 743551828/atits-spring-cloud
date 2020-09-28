package com.atits.information.client;

import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 资讯接口
 * @author: zhangys
 * @create: 2020-09-08 13:30
 **/
@FeignClient("atits-spring-cloud-information/information")
@Api("资讯接口")
public interface NewsClient{

    @GetMapping("/test")
    public String test();

    @GetMapping("/test2")
    public String test2();


}