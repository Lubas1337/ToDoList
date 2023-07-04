package com.lubas.todo.service;

import com.lubas.todo.entities.TodoEntity;
import com.lubas.todo.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final ToDoRepo todoRepository;

    @Autowired
    public TodoService(ToDoRepo todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    public TodoEntity createTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
}
