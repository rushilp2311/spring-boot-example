package com.example.restfulwebservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping(value = "/")
  public String index(){
    return "Greetings from spring boot!";
  }
}
