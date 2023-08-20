package com.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String idUser;
    private String password;
    @ManyToOne
    private StatusAccount statusAccount;
    @ManyToOne
    private Role role;
}
