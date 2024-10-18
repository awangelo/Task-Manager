package com.github.awangelo.taskmanager.model;

import jakarta.persistence.*;
import lombok.Data;

// Anotações para transformar a classe em uma entidade JPA
@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Priority priority;
    private boolean completed;

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }
}