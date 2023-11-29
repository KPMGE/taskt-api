package com.example.taskt.domain

import jakarta.persistence.*

@Entity
@Table(name = "todos")
data class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val done: Boolean = false,

    @Column(nullable = true)
    val description: String? = null,

    @Column(nullable = false)
    val hexColor: String
)
