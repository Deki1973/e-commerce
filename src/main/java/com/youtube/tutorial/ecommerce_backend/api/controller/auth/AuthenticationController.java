package com.youtube.tutorial.ecommerce_backend.api.controller.auth;

import com.youtube.tutorial.ecommerce_backend.api.model.RegistrationBody;
import com.youtube.tutorial.ecommerce_backend.exception.UserAlreadyExistsException;
import com.youtube.tutorial.ecommerce_backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    public AuthenticationController(UserService userService){
        this.userService=userService;
    }

    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity registerUser(@Valid @RequestBody RegistrationBody registrationBody){
        System.out.println(registrationBody.toString());
        try{
            userService.registerUser(registrationBody);
            return ResponseEntity.ok().build();
        }catch (UserAlreadyExistsException ex){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }
}
