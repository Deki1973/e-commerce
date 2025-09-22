package com.youtube.tutorial.ecommerce_backend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "local_user")
public class LocalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;



    @Column(name="username", length = 255, nullable = false, unique = true)
    private String username;

    @Column(name="password", length = 1000, nullable = false, unique = false)
    private String password;

    @Column(name = "email", length = 320, nullable = false, unique = true)
    private String email;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "user", cascade=CascadeType.REMOVE, orphanRemoval = true)
    private List<Address> address=new ArrayList<>();



}
