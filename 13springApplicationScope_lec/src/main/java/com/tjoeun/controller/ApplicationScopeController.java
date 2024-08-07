package com.tjoeun.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.bean.Developer;

@Controller
public class ApplicationScopeController {
	
	@Autowired
	ServletContext application;

	@GetMapping("/test1")
	// public void test1(@ModelAttribute HttpServletRequest request) {
	public void test1(HttpServletRequest request) {
		
		ServletContext application = request.getServletContext();
		
		// application scope 에 name 이라는 이름으로 data 올리기(저장하기)
		application.setAttribute("name", "강감찬");
		
	}
	
	@GetMapping("/result1")
	public void result1(HttpServletRequest request) {
		
		ServletContext application = request.getServletContext();
		String name = (String)application.getAttribute("name");
		
		System.out.printf("이름 : %s%n", name);
		
	}
	
	@GetMapping("/test2")
	public void test2() {
		this.application.setAttribute("address", "종로");
	}
	
	@GetMapping("/result2")
	public void result2() {
			
		String address = (String)this.application.getAttribute("address");
		System.out.printf("주소 : %s%n", address);
		
	}

	@GetMapping("/test3")
	public void test3() {
		
		Developer developer = new Developer();
		developer.setName("박제상");
		developer.setAge(67);
		
		this.application.setAttribute("developer", developer);
	}
	    
	@GetMapping("/result3")
	public void result3() {
		Developer developer = (Developer)this.application.getAttribute("developer");
		System.out.printf("developer : %s%n", developer);
	}
	
	@GetMapping("/test4")
	public String test4(Developer developer) {

		developer.setName("더조은");
		developer.setAge(21);
		return "forward:/result4";
	}
	    
	@GetMapping("/result4")
	// HttpServletRequest request 와 Model model 의 차이점
	// public void result4(HttpServletRequest request) {
	public void result4(HttpServletRequest request, Model model) {	
		Developer developer = (Developer)request.getAttribute("developer");
		System.out.println("developer(request) : " + developer);
		
		developer = (Developer)model.getAttribute("developer");
		System.out.println("developer(model)   : " + developer);
	}
	
}



