package com.example.demo.mappers.impl;

import com.example.demo.domain.dto.TaskDto;
import com.example.demo.domain.entities.Task;
import com.example.demo.mappers.TaskMapper;

public class TaskMapperImpl implements TaskMapper {
    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return null;
    }
}
