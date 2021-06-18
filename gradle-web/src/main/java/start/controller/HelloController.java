package start.controller;

import start.entity.UserEntity;
import start.service.EsService;
import start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private UserService userService;


  @RequestMapping(value = "/hello",method = RequestMethod.GET)//请求路径，会去templates下去寻找freemarkerindex
  @ResponseBody
  public UserEntity hello() {
    return userService.getUser();
  }


}
