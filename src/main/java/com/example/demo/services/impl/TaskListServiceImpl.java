package com.example.demo.services.impl;

import com.example.demo.domain.entities.TaskList;
import com.example.demo.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    @Override
    public List<TaskList> listTaskLists() {
        return List.of();
    }
}
