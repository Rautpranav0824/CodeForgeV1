package com.CodeForge.CodeForgeV1.entity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String userName;

    private String email;

    protected User(){

    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}
