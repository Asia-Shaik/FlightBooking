package com.javainuse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javainuse.model.UserInfo;

public interface UserRepository extends MongoRepository<UserInfo, String> {

}
