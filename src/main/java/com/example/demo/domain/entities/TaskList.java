package com.example.demo.domain.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;

import java.util.UUID;

@Entity
@Table(name = "task_list")
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id",updatable = false, nullable = false)
    private UUID id;


    @Column(name = "title", nullable = false)
    private String title;


    @Column(name = "description")
    private String description;

}
