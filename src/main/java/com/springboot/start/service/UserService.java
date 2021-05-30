package com.springboot.start.service;

import com.alibaba.fastjson.JSON;
import com.springboot.start.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  public UserEntity getUser() {
    UserEntity userEntity = new UserEntity();
    userEntity.setAge("18");
    userEntity.setName("ganyuan");
    userEntity.setSex("man");
    return userEntity;
  }
}
