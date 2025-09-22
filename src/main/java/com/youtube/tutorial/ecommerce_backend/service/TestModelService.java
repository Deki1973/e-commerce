package com.youtube.tutorial.ecommerce_backend.service;

import com.youtube.tutorial.ecommerce_backend.model.TestModel;
import com.youtube.tutorial.ecommerce_backend.repository.TestModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestModelService {

    @Autowired
    private TestModelRepo testModelRepo;

    public String test(){
        return "hihihi";
    }

    public TestModel add(TestModel testModel){
        return testModelRepo.save(testModel);
    }

    public List<TestModel> getAll(){
        return testModelRepo.findAll();
    }

}
