package com.lubas.todo.service;

import com.lubas.todo.entities.ToDoEntity;
import com.lubas.todo.repositories.ToDoRepo;
import org.springframework.stereotype.Service;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import java.util.List;

@Service
public class TodoService {

    private ToDoRepo todoRepository;

    public TodoService(ToDoRepo ToDoRepo) {
        this.todoRepository = ToDoRepo;
    }

    public void ToDoService(ToDoRepo todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void createTodoItem(ToDoEntity ent) {
        todoRepository.save(ent);
    }

    public List<ToDoEntity> getTodos() {
        return todoRepository.findAll();
    }

    public ToDoEntity getTodoById(Long id) throws NotFoundException {
        return todoRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}
