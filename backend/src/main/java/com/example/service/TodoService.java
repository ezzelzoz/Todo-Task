package com.example.service;

import com.example.dto.TodoDto;
import com.example.repository.TodoRepository;
import com.example.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
//@AllArgsConstructor
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

//    public TodoService(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }

//    public List<Todo> getAllTodos() {
//        return todoRepository.findAll();
//    }
    public Flux<TodoDto>getAllTodos(){return todoRepository.findAll().map(AppUtils::entityToDto);}


//    public Todo getTodoWithId(todoId) {
//        return new Todo(todoRepository.findById(todoId);
//    }
public Mono<TodoDto>getTodoByID(String todoId){return todoRepository.findById(todoId).map(AppUtils::entityToDto);}


//    public void addTodo(Todo todo) {
//        todoRepository.save(todo);
//    }
public Mono<TodoDto>addTodo(Mono<TodoDto> todoDtoMono){return todoDtoMono.map(AppUtils::dtoToEntity).flatMap(todoRepository::insert).map(AppUtils::entityToDto);}

//    public void deleteTodo(String todoId) {
//        boolean exist= todoRepository.existsById(todoId);
//        if(!exist)
//        {
//            throw new IllegalStateException(
//                    "todo with id " + todoId + "does not exist");
//        }
//        todoRepository.deleteById(todoId);
//    }
    public Mono<Void> deleteTodo(String todoId){
        return todoRepository.deleteById(todoId);
    }

//    @Transactional
//    public void updateTodo(String todoId, LocalDateTime finished, LocalDateTime reminder) {
//        Todo todo=todoRepository.findById(todoId).orElseThrow(()->
//                new IllegalStateException("todo with Id "+todoId+"does not exist"));
//        if(finished!=null)
//        {
//            todo.setFinished(finished);
//        }
//        if(reminder!=null){
//            todo.setReminder(reminder);
//        }
//    }

//    public Todo findById(String id) {
//        return todoRepository.findById(id).orElse(null);
//    }

}
