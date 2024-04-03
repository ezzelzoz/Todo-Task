package com.example.utils;

import com.example.dto.TodoDto;
import com.example.model.Todo;
import org.springframework.beans.BeanUtils;

public class AppUtils {
    public static TodoDto entityToDto(Todo todo){
        TodoDto todoDto= new TodoDto();
        BeanUtils.copyProperties(todo,todoDto);
        return todoDto;
    }
    public static Todo dtoToEntity(TodoDto todoDto){
        Todo todo= new Todo();
        BeanUtils.copyProperties(todoDto,todo);
        return todo;
    }
}
