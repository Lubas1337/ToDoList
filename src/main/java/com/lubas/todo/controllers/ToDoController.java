package com.lubas.todo.controllers;

import com.lubas.todo.entities.ToDoEntity;
import com.lubas.todo.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    private final ToDoRepo toDoRepo;

    @Autowired
    public ToDoController(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    @GetMapping
    public List<ToDoEntity> getAllToDoEntities() {
        return toDoRepo.findAll();
    }

    @PostMapping
    public ToDoEntity createToDoEntity(@RequestBody ToDoEntity toDoEntity) {
        return toDoRepo.save(toDoEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteToDoEntity(@PathVariable Long id) {
        toDoRepo.deleteById(id);
    }
}

