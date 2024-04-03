package com.example.controller;

import com.example.dto.TodoDto;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public Flux<TodoDto> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{todoId}")
    public Mono<TodoDto> getTodoByID(String todoId){
        return todoService.getTodoByID(todoId);
    }

    @PostMapping
    public Mono<TodoDto> addTodo(@RequestBody Mono<TodoDto>todoDtoMono){
        return todoService.addTodo(todoDtoMono);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteTodo(String todoId){
        return todoService.deleteTodo(todoId);
    }
//    @GetMapping
//    public List<Todo> fetchAllTodos(){
//        return todoService.getAllTodos();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Todo> getTodoById(@PathVariable("id") String id) {
//        Todo todo = todoService.findById(id);
//        if (todo != null) {
//            return ResponseEntity.ok(todo);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//    ///////////problem
//    @PostMapping
//    public void addTodo(@RequestBody Todo todo)
//    {
//        System.out.println(todo);
//        todoService.addTodo(todo);
//        System.out.println(todo);
//    }
//
//
//    /////////problem
//    @DeleteMapping(path = "{todoId}")
//    public void deleteTodo(@PathVariable("todoId") String todoId){
//        todoService.deleteTodo(todoId);
//    }
//    @PutMapping(path = "{todoId}")
//    public void updateTodo(@PathVariable("todoId") String todoId,
//                           @RequestParam(required = false)LocalDateTime finished,
//                           @RequestParam(required = false) LocalDateTime reminder
//    ){
//        todoService.updateTodo(todoId,finished,reminder);
//    }
}
