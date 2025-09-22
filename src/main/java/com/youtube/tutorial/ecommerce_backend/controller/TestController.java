package com.youtube.tutorial.ecommerce_backend.controller;

import com.youtube.tutorial.ecommerce_backend.model.TestModel;
import com.youtube.tutorial.ecommerce_backend.service.TestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TestController {

    @Autowired
    private TestModelService testModelService;

    @GetMapping("/test")
    public String test(){
        System.out.println("triggered controller test..");
        return testModelService.test();
    }

    @PostMapping("/test")
    public TestModel add(@RequestBody TestModel testModel){
        return testModelService.add(testModel);
    }

    @GetMapping("/test/getall")
    public List<TestModel> getall(){
        return testModelService.getAll();
    }

}
