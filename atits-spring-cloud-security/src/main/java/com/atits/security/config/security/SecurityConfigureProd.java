package com.atits.security.config.security;

import com.atits.base.security.config.SecurityConfigureTemplate;
import com.atits.security.config.handler.UserLoginFailureHandler;
import com.atits.security.config.handler.UserLoginSuccessHandler;
import com.atits.security.config.handler.UserLogoutSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @description: 该配置类，主要处理⽤户名和密码的校验等事宜
 * @author: zhangys
 * @create: 2020-09-10 13:52
 **/
@Configuration
@Profile("prod")
public class SecurityConfigureProd extends WebSecurityConfigurerAdapter{


    /**
     * 注册⼀个认证管理器对象到容器
     *
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        SecurityConfigureTemplate securityConfigureTemplate = new SecurityConfigureTemplate(authenticationManager());
        securityConfigureTemplate.configureProd(http);
        http
                // 配置登录地址
                .formLogin()
                .loginProcessingUrl("/login")
                // 配置登录成功自定义处理类
                .successHandler(new UserLoginSuccessHandler())
                // 配置登录失败自定义处理类
                .failureHandler(new UserLoginFailureHandler())
                .and()
                // 配置登出地址
                .logout()
                .logoutUrl("/logout")
                // 配置用户登出自定义处理类
                .logoutSuccessHandler(new UserLogoutSuccessHandler());
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    /**
     * 密码编码对象（密码不进⾏加密处理）
     * @return PasswordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
