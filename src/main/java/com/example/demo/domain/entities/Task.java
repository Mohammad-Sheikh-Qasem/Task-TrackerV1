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


}
