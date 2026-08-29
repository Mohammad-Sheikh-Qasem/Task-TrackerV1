package com.example.demo.mappers;

import com.example.demo.domain.dto.TaskListDto;
import com.example.demo.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
}
