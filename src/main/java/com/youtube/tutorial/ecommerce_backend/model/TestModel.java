package com.youtube.tutorial.ecommerce_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="test")
public class TestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name = "username", nullable = true)
    private String username;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //parametarized
    public TestModel(long id, String username) {
        this.id = id;
        this.username = username;
    }
    //default
    public TestModel(){

    }
}
