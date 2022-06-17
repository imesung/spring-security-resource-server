package com.mesung.mesungspringsecurityoauth2.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


//@Service
//@Transactional
//class CustomUserDetailsService : UserDetailsService {
//    @Autowired
//    private val userRepository: UserRepository? = null
//
//    @Bean
//    fun passwordEncoder(): PasswordEncoder {
//        return BCryptPasswordEncoder(11)
//    }
//
//    @Throws(UsernameNotFoundException::class)
//    override fun loadUserByUsername(email: String): UserDetails {
//        val user: User = (userRepository?.findByEmail(email) ?: throw UsernameNotFoundException("No User Found")) as User
//        return org.springframework.security.core.userdetails.User(
//            user.email,
//            user.password,
//            user.enabled,
//            true,
//            true,
//            true,
//            getAuthorities(java.util.List.of(user.role) as List<String>)
//        )
//    return
//    }
//
//    private fun getAuthorities(roles: List<String>): Collection<GrantedAuthority> {
//        val authorities: MutableList<GrantedAuthority> = ArrayList()
//        for (role in roles) {
//            authorities.add(SimpleGrantedAuthority(role))
//        }
//        return authorities
//    }
//}