package com.mesung.mesungspringsecurityoauth2.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.AuthenticationException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service


//@Service
//class CustomAuthenticationProvider : AuthenticationProvider {
//    @Autowired
//    private val customUserDetailsService: CustomUserDetailsService? = null
//
//    @Autowired
//    private val passwordEncoder: PasswordEncoder? = null
//
//    @Throws(AuthenticationException::class)
//    override fun authenticate(authentication: Authentication): Authentication {
//        val username: String = authentication.getName()
//        val password: String = authentication.getCredentials().toString()
//        val user = customUserDetailsService!!.loadUserByUsername(username)
//        return checkPassword(user, password)
//    }
//
//    private fun checkPassword(user: UserDetails, rawPassword: String): Authentication {
//        return if (passwordEncoder!!.matches(rawPassword, user.password)) {
//            UsernamePasswordAuthenticationToken(
//                user.username,
//                user.password,
//                user.authorities
//            )
//        } else {
//            throw BadCredentialsException("Bad Credentials")
//        }
//    }
//
//    override fun supports(authentication: Class<*>?): Boolean {
//        return UsernamePasswordAuthenticationToken::class.java.isAssignableFrom(authentication)
//    }
//}