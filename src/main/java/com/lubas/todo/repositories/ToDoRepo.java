package com.lubas.todo.repositories;

import com.lubas.todo.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<TodoEntity, Long> {
}
