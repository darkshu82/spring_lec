package com.tjoeun.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionHandlingController {
	
	@GetMapping("/exception_test1")
	public String exception_test1(Model model) {
		
		List<String> strList = null;
    strList.add("더조은스프링");
    /*
    int[] arrInt = new int[] {111, 222, 333};
		System.out.println("arrInt[0] : " + arrInt[0]);
		System.out.println("arrInt[5] : " + arrInt[5]);
		
		model.addAttribute("arrInt", arrInt);
		*/
		return "exception_test1";
	}  
	  
  // @ExceptionHandler(Exception.class)
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String arrayException() {
		return "error_page";
	}
     
}
