package com.atits.base.security.config;

import com.atits.base.security.filter.JWTAuthenticationTokenFilterDev;
import com.atits.base.security.filter.JWTAuthenticationTokenFilterProd;
import com.atits.base.security.handler.UserAuthAccessDeniedHandler;
import com.atits.base.security.handler.UserAuthenticationEntryPointHandler;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * 该配置类，主要处理⽤户名和密码的校验等事宜
 *
 * @author zhangys
 * @date 2020-09-10 13:52
 **/
public class SecurityConfigureTemplate {

    AuthenticationManager authenticationManager;

    public SecurityConfigureTemplate(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public void configureDev(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .csrf().disable()
                .cors();

        // 基于Token不需要session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // 禁用缓存
        http.headers().cacheControl();
        // 添加JWT过滤器
        http.addFilter(new JWTAuthenticationTokenFilterDev(authenticationManager));
    }

    public void configureProd(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 需要登陆后才能访问
                .anyRequest().authenticated()
                .and()
                // 配置未登录自定义处理类
                .exceptionHandling().authenticationEntryPoint(new UserAuthenticationEntryPointHandler())
                .and()
                // 配置没有权限自定义处理类
                .exceptionHandling().accessDeniedHandler(new UserAuthAccessDeniedHandler())
                .and()
                // 开启跨域
                .cors()
                .and()
                // 取消跨站请求伪造防护
                .csrf().disable();

        // 基于Token不需要session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // 禁用缓存
        http.headers().cacheControl();
        // 添加JWT过滤器
        http.addFilter(new JWTAuthenticationTokenFilterProd(authenticationManager));
    }
}