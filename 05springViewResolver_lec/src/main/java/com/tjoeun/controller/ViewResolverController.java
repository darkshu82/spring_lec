package com.tjoeun.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tjoeun.beans.Number1;
import com.tjoeun.beans.Number2;

@Controller
public class ViewResolverController {
	
	@GetMapping("/test1")
	public String test1(@RequestParam int num1,
			                int num2,
			                @RequestParam Map<String, String> map1,
			                @RequestParam("nums") List<String> list1) {
		
		System.out.println("num1 : " + num1);		
		System.out.println("num2 : " + num2); 
		
		map1.forEach((key, value) -> System.out.println(key + " : " + value));
		
		System.out.println("list1 : " + list1);
		
		return "result";
	}
	
	// Number1, Number2 <-- Command 객체
	// parameter 에 Model(ModelAndView) 객체를 선언하지 않아도
	// 자동으로 request scope 에 객체를 올림
	@GetMapping("/test2")
	public String test2(@ModelAttribute Number1 number1,
			                Number2 number2) {
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		
		return "test2";
	}
	
  //Number1, Number2 <-- Command 객체
	@GetMapping("/test6")
	public String test6(@ModelAttribute("figure1") Number1 num1,
			                @ModelAttribute("figure2") Number2 num2) {
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		return "test6";
	}
	
  @GetMapping("/test3")
  public String test3(HttpServletRequest request) {
  	
  	request.setAttribute("figure1", 1111);
  	request.setAttribute("figure2", 2222);
  	
  	return "test3";
  }
  
  @GetMapping("/test4")
  public String test4(Model model) {
  	
  	model.addAttribute("number1", 3333);
  	model.addAttribute("number2", 5555);
  	
  	return "test4";
  }
  
  @GetMapping("/test5")
  public ModelAndView test5(ModelAndView mv) {
  	
  	mv.addObject("number3", 7777);
  	mv.addObject("number4", 8888);
  	mv.setViewName("test5");
  	
  	return mv;
  }
}


