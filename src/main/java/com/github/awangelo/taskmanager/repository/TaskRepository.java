package com.github.awangelo.taskmanager.repository;

import com.github.awangelo.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> { }
