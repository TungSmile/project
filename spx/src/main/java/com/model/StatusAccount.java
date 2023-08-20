package com.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StatusAccount {
    @Id
    private int id;
    private String name;
}
