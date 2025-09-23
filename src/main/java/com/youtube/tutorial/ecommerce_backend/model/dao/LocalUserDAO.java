package com.youtube.tutorial.ecommerce_backend.model.dao;

import com.youtube.tutorial.ecommerce_backend.model.LocalUser;
import org.springframework.data.repository.CrudRepository;
/*Lesson 7*/
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;


public interface LocalUserDAO extends ListCrudRepository<LocalUser, Long> {

    Optional<LocalUser> findByUsernameIgnoreCase(String username);

    Optional<LocalUser> findByEmailIgnoreCase(String email);
}
