package com.mesung.mesungspringsecurityoauth2.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController () {

    @GetMapping("/api/signup/{email}/{password}")
    fun signup(@PathVariable email : String, @PathVariable password : String): String {
        val encoder = BCryptPasswordEncoder()
        val encodePw = encoder.encode(password)
        saveRepository(email, encodePw)
        return "hello"
    }

    private fun saveRepository(userEmail: String, encodePw: String?) {
        println("first $userEmail $encodePw")

//        val user = User()
//        println(user.email + " " + user.password)
//        userRepository.save(user)
    }

//    @GetMapping("api/signup/get")
//    fun getId() : String {
//        val findByEmail = userRepository.findByEmail("myhs2002")
//        if (findByEmail != null) {
//            println(findByEmail.email + " " + findByEmail.password)
//        } else {
//            println("null 나옴")
//        }
//        return "getId"
//    }
}
