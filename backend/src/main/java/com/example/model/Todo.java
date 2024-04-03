package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document(collection = "todos")
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    private String id;
    private String title;
    private String description;
    private LocalDateTime finished;
    private LocalDateTime reminder;

    public Todo(String title, String description, LocalDateTime finished, LocalDateTime reminder) {
        this.title = title;
        this.description = description;
        this.finished = finished;
        this.reminder = reminder;
    }
}
