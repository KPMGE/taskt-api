package com.example.taskt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TasktApplication

fun main(args: Array<String>) {
	runApplication<TasktApplication>(*args)
}
