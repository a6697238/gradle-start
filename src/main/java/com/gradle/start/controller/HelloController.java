package com.gradle.start.controller;

import com.gradle.start.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  @Autowired
  private BeanService beanService;

  @RequestMapping("/")
  public String index() {
    return beanService.getUser();
  }

}