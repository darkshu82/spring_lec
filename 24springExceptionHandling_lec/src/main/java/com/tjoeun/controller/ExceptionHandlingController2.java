package com.tjoeun.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionHandlingController2 {
	
	@GetMapping("/exception_test2")
	public String exception_test1(Model model) {

    List<String> strList = null;
    strList.add("더조은스프링");
    
		// model.addAttribute("arrInt", arrInt);
		return "exception_test2";
	}  
	/*  
  // @ExceptionHandler(Exception.class)
	@ExceptionHandler(NullPointerException.class)
	public String arrayException() {
		return "error_page2";
	}
  */ 
}
