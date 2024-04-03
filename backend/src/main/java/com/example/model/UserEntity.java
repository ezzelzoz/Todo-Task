package com.example.model;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.relation.Role;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
@NoArgsConstructor
@Setter
@Getter
public class UserEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String userName;
    private String password;
    private LocalDateTime dateOfBirth;

    public UserEntity(String firstName, String lastName, String phone, String userName, String password, LocalDateTime dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }
    @DBRef
    private List<Role> roles = new ArrayList<>();
}
