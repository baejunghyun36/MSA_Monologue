package com.example.userservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

//configuration 우선순위
@Configuration
@EnableWebSecurity
public class WebSecurity {

    //websecurityConfigurerAdapter deprecated 됨.

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //http csrf는 사용하지 않음.
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/users/**").permitAll();
        //허용할 수 있는 것. users 관련 api 모두 혀용.
        return http.build();
    }
}
