package com.example.todo.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Task {

    @Id
    private UUID id;

    private String title;
    private boolean completed;

    public Task() {}

    public Task(UUID id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
