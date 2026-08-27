package com.example.demo.domain.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;


    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private LocalDateTime dueData;

    @Column(name = "status", nullable = false)
    private TaskStatus status;

    @Column(name  = "priority", nullable = false)
    private TaskPriority priority;


    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "updated", nullable = false)
    private LocalDateTime updated;


    public Task() {
    }

    public Task(LocalDateTime created, String description, LocalDateTime dueData, UUID id, TaskPriority priority, TaskStatus status, String title, LocalDateTime updated) {
        this.created = created;
        this.description = description;
        this.dueData = dueData;
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.title = title;
        this.updated = updated;
    }
}
