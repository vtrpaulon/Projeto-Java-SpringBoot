package com.example.javaProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javaProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
