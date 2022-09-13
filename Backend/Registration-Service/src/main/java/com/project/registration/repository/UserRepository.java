package com.project.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.registration.model.UserInfo;

public interface UserRepository extends MongoRepository<UserInfo, String> {

}
