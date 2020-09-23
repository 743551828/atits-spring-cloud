package com.atits.information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-08 15:36
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableFeignClients
public class InformationApplication {

    public static void main(String[] args) {
        SpringApplication.run(InformationApplication.class);
    }

}
