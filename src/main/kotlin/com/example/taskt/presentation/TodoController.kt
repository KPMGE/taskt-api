package com.example.taskt.presentation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.example.taskt.infra.TodoRepository
import com.example.taskt.domain.Todo


@RestController
@RequestMapping("/api/todos")
class TodoController(@Autowired private val todoRepo: TodoRepository) {
  @GetMapping("")
  fun getAllTodos(): List<Todo> = todoRepo.findAll().toList()

  @PostMapping("")
  fun insertTodo(@RequestBody todo: Todo): ResponseEntity<Todo> {
    val insertedTodo = todoRepo.save(todo)
    return ResponseEntity(insertedTodo, HttpStatus.CREATED)
  }
}
