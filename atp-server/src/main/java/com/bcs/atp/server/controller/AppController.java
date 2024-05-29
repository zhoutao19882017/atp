package com.bcs.atp.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"应用管理"})
public class AppController {

  @ApiOperation(value = "连通性测试")
  @GetMapping(value = "/ping")
  public String providers() {
    return "Success";
  }

}
