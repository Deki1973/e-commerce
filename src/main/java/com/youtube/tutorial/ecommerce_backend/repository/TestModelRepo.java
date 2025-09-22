package com.youtube.tutorial.ecommerce_backend.repository;

import com.youtube.tutorial.ecommerce_backend.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestModelRepo extends JpaRepository<TestModel, Long> {

}
