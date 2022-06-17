package com.mesung.mesungspringsecurityoauth2.entity

import lombok.Data
import javax.persistence.*


@Data
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null
    private val firstName: String? = null
    private val lastName: String? = null
    private val email: String? = null

    @Column(length = 60)
    private val password: String? = null
    private val role: String? = null
    private val enabled = false
}