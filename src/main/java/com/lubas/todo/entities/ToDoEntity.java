package com.lubas.todo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "todolist")
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    public ToDoEntity(String text) {
        this.text = text;
    }

    public ToDoEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
