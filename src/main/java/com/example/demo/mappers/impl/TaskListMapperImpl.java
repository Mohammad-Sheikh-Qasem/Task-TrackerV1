package com.example.demo.mappers.impl;

import com.example.demo.domain.dto.TaskListDto;
import com.example.demo.domain.entities.TaskList;
import com.example.demo.mappers.TaskListMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskListMapperImpl implements TaskListMapper {
    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(

        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return null;
    }
}
