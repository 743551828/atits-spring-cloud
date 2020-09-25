package com.atits.security.config.security;

import com.atits.base.security.filter.JWTAuthenticationTokenFilter;
import com.atits.base.security.handler.UserAuthAccessDeniedHandler;
import com.atits.base.security.handler.UserAuthenticationEntryPointHandler;
import com.atits.security.config.handler.UserLoginFailureHandler;
import com.atits.security.config.handler.UserLoginSuccessHandler;
import com.atits.security.config.handler.UserLogoutSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @description: 该配置类，主要处理⽤户名和密码的校验等事宜
 * @author: zhangys
 * @create: 2020-09-10 13:52
 **/
@Configuration
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

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
        http.authorizeRequests()
                // 需要登陆后才能访问
                .anyRequest().authenticated()
                .and()
                // 配置未登录自定义处理类
                .exceptionHandling().authenticationEntryPoint(new UserAuthenticationEntryPointHandler())
                .and()
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
                .logoutSuccessHandler(new UserLogoutSuccessHandler())
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
        http.addFilter(new JWTAuthenticationTokenFilter(authenticationManager()));
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
