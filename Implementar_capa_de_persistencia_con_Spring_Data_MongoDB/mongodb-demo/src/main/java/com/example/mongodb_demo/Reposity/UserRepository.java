package com.example.mongodb_demo.Reposity;

import com.example.mongodb_demo.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
