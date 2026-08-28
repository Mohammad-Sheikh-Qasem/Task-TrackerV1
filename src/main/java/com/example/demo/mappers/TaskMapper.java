package com.example.demo.mappers;

import com.example.demo.domain.dto.TaskDto;
import com.example.demo.domain.entities.Task;

public interface TaskMapper {

   Task fromDto(TaskDto taskDto);

}
