package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectForwardController {
  @GetMapping("/redirectMethod")
  public String redirectMethod() {
  	// return "redirect";
  	return "redirect:/redirect2";
  }
  
  @GetMapping("/redirect2")
  public String redirect2() {
  	return "redirect2";
  }
  
  @GetMapping("/forwardMethod")
  public String forwardMethod() {
  	return "forward:/forward2";
  }
  
  @GetMapping("/forward2")
  public String forward2() {
  	return "forward2";
  }
  
}
