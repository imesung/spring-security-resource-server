package com.mesung.mesungspringsecurityoauth2.config;

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity) : SecurityFilterChain? {
        http
            .authorizeHttpRequests()
            .antMatchers("/api/hello").permitAll()
            .anyRequest().authenticated()
            .and().formLogin()
        return http.build()
    }
}
