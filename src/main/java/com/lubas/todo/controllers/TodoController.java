package com.lubas.todo.controllers;

import com.lubas.todo.entities.TodoEntity;
import com.lubas.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
    public class TodoController {
        private final TodoService todoService;

        @Autowired
        public TodoController(TodoService todoService) {
            this.todoService = todoService;
        }

        @GetMapping
        public List<TodoEntity> getAllTodos() {
            return todoService.getAllTodos();
        }

        @PostMapping
        public TodoEntity createTodo(@RequestBody TodoEntity todo) {
            return todoService.createTodo(todo);
        }

        @DeleteMapping("/{id}")
        public void deleteTodoById(@PathVariable Long id) {
            todoService.deleteTodoById(id);
        }
}

