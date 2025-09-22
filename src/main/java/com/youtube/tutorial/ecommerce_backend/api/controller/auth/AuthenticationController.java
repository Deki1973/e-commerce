package com.youtube.tutorial.ecommerce_backend.api.controller.auth;

import com.youtube.tutorial.ecommerce_backend.api.model.RegistrationBody;
import com.youtube.tutorial.ecommerce_backend.service.UserService;
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
    public void registerUser(@RequestBody RegistrationBody registrationBody){
        System.out.println(registrationBody.toString());

        userService.registerUser(registrationBody);
    }
}
