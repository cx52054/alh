package com.kcsm.alh.alheurekaserver;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description: websecurity权限配置
 *
 * @author chengxi
 * @since JDK 1.8
 * date: 2020/8/12 21:00
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeRequests()
                // 任何请求,登录后可以访问
                .anyRequest()
                // 定义哪些URL需要被保护、哪些不需要被保护
                .authenticated()
                .and()
                .httpBasic();
    }
}
