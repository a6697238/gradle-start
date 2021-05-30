package com.gradle.start.service;

import com.alibaba.fastjson.JSON;
import com.gradle.start.entity.UserEntity;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class BeanService {

  private UserEntity userEntity = null;

  @PostConstruct
  private void init() {
    userEntity = new UserEntity();
    userEntity.setAge("11");
    userEntity.setName("asdasd");
    userEntity.setSex("woman");
  }

  public String getUser() {
    return JSON.toJSONString(userEntity);
  }

}
