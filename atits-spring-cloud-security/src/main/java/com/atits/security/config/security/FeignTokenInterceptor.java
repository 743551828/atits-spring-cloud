package com.atits.security.config.security;

import com.atits.base.properties.JWTProperties;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @description: 为远程调用添加token
 * @author: zhangys
 * @create: 2020-09-10 13:52
 **/
@Configuration
@Profile("prod")
public class FeignTokenInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String tokenHeader = JWTProperties.tokenHeader;
        template.header(tokenHeader, request.getHeader(tokenHeader));
    }

}