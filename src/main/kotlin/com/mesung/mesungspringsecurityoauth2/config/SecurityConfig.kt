package com.mesung.mesungspringsecurityoauth2.config;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain


@EnableWebSecurity
class SecurityConfig {

//    @Autowired
//    private val customAuthenticationProvider: CustomAuthenticationProvider? = null

    @Bean
    fun securityFilterChain(http: HttpSecurity) : SecurityFilterChain? {
        http
            .csrf().disable()
            .authorizeHttpRequests()
            .antMatchers("/h2-console/*").permitAll()
            .antMatchers("/api/signup/**").permitAll()
            .anyRequest().authenticated()
//            .and().headers().frameOptions().disable()
            .and().formLogin(Customizer.withDefaults())
        return http.build()
    }

    @Bean
    fun users(): UserDetailsService? {
        val user: UserDetails = User.withDefaultPasswordEncoder()
            .username("admin")
            .password("password")
            .roles("USER")
            .build()
        return InMemoryUserDetailsManager(user)
    }

}
