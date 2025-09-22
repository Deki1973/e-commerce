package com.youtube.tutorial.ecommerce_backend.controller;

import com.youtube.tutorial.ecommerce_backend.model.LocalUser;
import com.youtube.tutorial.ecommerce_backend.repository.LocalUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class Controller1 {

    // stao si na 15 min lekcije 3
    @Autowired
    private LocalUserRepo userRepo;

    @GetMapping("/getall")
    public List<LocalUser> getall(){
        return userRepo.findAll();
    }

}
