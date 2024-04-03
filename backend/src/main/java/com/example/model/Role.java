package com.example.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Document(value = "roles")
public class Role {
    @Id
    private int id;
    private String name;

    //many to many relationship
    @DBRef
    private List<UserEntity> users = new ArrayList<>();
}
