package com.atits.information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-08 15:36
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableWebSecurity
@ComponentScan({"com.atits.base","com.atits.information"})
public class InformationApplication {

    public static void main(String[] args) {
        SpringApplication.run(InformationApplication.class);
    }

}
