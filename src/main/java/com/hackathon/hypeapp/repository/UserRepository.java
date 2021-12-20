package com.hackathon.hypeapp.repository;

import com.hackathon.hypeapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,UUID> {
    boolean existsByEmail(String email);
    UserEntity findByEmail(String email);
}
