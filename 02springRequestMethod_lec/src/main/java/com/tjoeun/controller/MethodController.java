package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController {
  @GetMapping("/test1")
  public String test1GET() {
  	return "test1";
  }
  @PostMapping("/test1")
  public String test1Post() {
  	return "test1Post";
  }
  @RequestMapping(value="/test2", method={RequestMethod.GET, RequestMethod.POST})
  public String test2GetPost() {
  	return "test2GetPost";
  }
  
} 




