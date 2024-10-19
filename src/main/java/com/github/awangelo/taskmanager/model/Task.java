package com.github.awangelo.taskmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Anotações para transformar a classe em uma entidade JPA
@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Priority priority;
    @Builder.Default
    private boolean completed = false;

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }
}