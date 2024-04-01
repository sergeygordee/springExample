package com.example.springExample.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userPass")
    private String userPass;
    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "userCountry")
    private String userCountry;

}
