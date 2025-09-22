package com.youtube.tutorial.ecommerce_backend.repository;

import com.youtube.tutorial.ecommerce_backend.model.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalUserRepo extends JpaRepository<LocalUser, Long> {
}
