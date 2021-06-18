package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import start.entity.UserEntity;
import start.service.EsService;
import start.service.UserService;

@RestController
public class EsController {

  @Autowired
  private EsService esService;


  @RequestMapping(value = "/put_data",method = RequestMethod.GET)//请求路径，会去templates下去寻找freemarkerindex
  @ResponseBody
  public boolean putData() {
    return esService.putAdUrl();
  }


}
