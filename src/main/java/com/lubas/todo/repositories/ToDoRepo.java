package com.lubas.todo.repositories;

import com.lubas.todo.entities.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDoEntity, Long> {
}
