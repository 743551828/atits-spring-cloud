package com.atits.information.config;

import com.atits.base.security.config.SecurityConfigureTemplate;
import com.atits.base.security.filter.JWTAuthenticationTokenFilter;
import com.atits.base.security.handler.UserAuthAccessDeniedHandler;
import com.atits.base.security.handler.UserAuthenticationEntryPointHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @description: 该配置类，主要处理⽤户名和密码的校验等事宜
 * @author: zhangys
 * @create: 2020-09-10 13:52
 **/
@Configuration
@Profile("dev")
public class SecurityConfigureDev extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        SecurityConfigureTemplate securityConfigureTemplate = new SecurityConfigureTemplate(authenticationManager());
        securityConfigureTemplate.configureDev(http);
    }

}
