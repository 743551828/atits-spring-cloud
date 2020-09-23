package com.atits.information.client.information;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-21 14:38
 **/
@FeignClient("atits-spring-cloud-evaluation")
public interface TestClient {

    @GetMapping("test")
    String test();


}
