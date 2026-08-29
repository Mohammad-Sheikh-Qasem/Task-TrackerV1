package com.example.demo.mappers.impl;

import com.example.demo.domain.dto.TaskListDto;
import com.example.demo.domain.entities.TaskList;
import com.example.demo.mappers.TaskListMapper;
import com.example.demo.mappers.TaskMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TaskListMapperImpl implements TaskListMapper {

    private final TaskMapper taskMapper;

    public TaskListMapperImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }


    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(
                taskListDto.id(),
                taskListDto.title(),
                taskListDto.description(),
                Optional.ofNullable(taskListDto.tasks())
                        .map(tasks -> tasks.stream().map(taskMapper::fromDto)
                                .toList()
                        ).orElse(null),
                null,
                null

        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return null;
    }
}
