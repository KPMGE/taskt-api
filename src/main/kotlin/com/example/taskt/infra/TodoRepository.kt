package com.example.taskt.infra

import org.springframework.data.repository.CrudRepository
import com.example.taskt.domain.Todo

interface TodoRepository : CrudRepository<Todo, Long>
