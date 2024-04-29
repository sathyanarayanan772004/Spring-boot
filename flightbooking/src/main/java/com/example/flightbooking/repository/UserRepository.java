package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightbooking.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
 
}