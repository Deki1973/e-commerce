package com.youtube.tutorial.ecommerce_backend.controller;

import com.youtube.tutorial.ecommerce_backend.api.model.RegistrationBody;
import com.youtube.tutorial.ecommerce_backend.model.LocalUser;
import com.youtube.tutorial.ecommerce_backend.repository.LocalUserRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class Controller1 {


    @Autowired
    private LocalUserRepo userRepo;

    @GetMapping("/getall")
    public List<LocalUser> getall(){
        return userRepo.findAll();
    }





}
