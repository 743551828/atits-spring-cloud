package com.atits.information.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 负载均衡配置
 *
 * @author zhangys
 * @date 2020-09-29 13:20
 **/
@Configuration
public class LoadBalancerRuleConfig {

    @Bean
    @Scope(value="prototype")
    public IRule loadBalanceRule(){
        return new NacosRule();
    }

}
