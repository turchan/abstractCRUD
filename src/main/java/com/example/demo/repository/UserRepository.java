package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CommonRepository<User> {
}