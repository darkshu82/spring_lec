package com.tjoeun.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tjoeun.beans.Developer;

@Controller
@SessionAttributes({"sessionDeveloper", "sessionProgrammer"})
public class SessionScopeController {
	/*
	 	@ModelAttribute 를 사용해서 해당 객체를 생성해서 반환하는 
	 	  메소드를  작성해야 됨
	 	
	 	client 로부터 request 가 sever 쪽으로 오면
	 	@SessionAttributes("sessionDeveloper") 에 의해서
	 	public Developer sessionDeveloper() 메소드가 자동으로 호출됨
	 	 (sessionDeveloper() 메소드가 호출되면 Developer 객체의 주소가 반환됨)
	 	ㄴ 반환된 Developer 객체의 주소는  Session Scope 에 자동으로 저장됨
	 	                                      ㄴ session.setAttribute("developer", developer)
	 	                                          ㄴ 이 code 가 자동으로 실행됨
	*/
	@ModelAttribute("sessionDeveloper")
	public Developer sessionDeveloper() {
		return new Developer();
	}
	
	@ModelAttribute("sessionProgrammer")
	public Developer sessionProgrammer() {
		return new Developer();
	}
	
	@GetMapping("/test7")
	public void test7(@ModelAttribute("sessionDeveloper") Developer developer,
			              @ModelAttribute("sessionProgrammer") Developer programmer) {
		
		developer.setName("윤봉길");
		developer.setAge(32);
		
		programmer.setName("더조은");
		programmer.setAge(23);
		
	}
	
	@GetMapping("/result7")
	public void result7(@ModelAttribute("sessionDeveloper") Developer developer,
                      @ModelAttribute("sessionProgrammer") Developer programmer) {
		System.out.println("developer  : " + developer);
		System.out.println("programmer : " + programmer);
	}
	
	
	
	/*
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	*/
	@GetMapping("/test1")
	// public void test1(HttpServletRequest request) { 
	public void test1(HttpSession session) { 
		// HttpSession session = request.getSession();
		session.setAttribute("name", "이순신");
	}
	
	@GetMapping("/test2")
	public String test2(HttpSession session) { 
		session.setAttribute("age", 46);
		return "redirect:/result2";
	}
	
	@GetMapping("/result2")
	public void result2(HttpSession session) {
		int age = (Integer)session.getAttribute("age");
		System.out.printf("나이 : %d 세%n", age);
		
	}
	
	@GetMapping("/test3")
	public String test3(HttpSession session) { 
		session.setAttribute("address", "서울");
		return "forward:/result3";
	}
	
	@GetMapping("/result3")
	public void result3(HttpSession session) {
		String address = (String)session.getAttribute("address");
		System.out.printf("주소 : %s%n", address);
	}
	
	@GetMapping("/result1")
	// public void result1(HttpServletRequest request) { 
	public void result1(HttpSession session) { 
		// HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		System.out.println("이름 : " + name);
	}
	
	@GetMapping("/test4")
	public void test4(HttpSession session, Developer developer) {
		
		developer.setName("강감찬");
		developer.setAge(72);
		session.setAttribute("developer", developer);
	}
	
	@GetMapping("/result4")
	public void result4(HttpSession session) {
		
		Developer developer = (Developer)session.getAttribute("developer");
		System.out.println("developer : " + developer);
	}
	   
	
	@GetMapping("/test5")
	public void test5(HttpSession session, Developer developer) {
		
		developer.setName("유관순");
		developer.setAge(18);
		session.setAttribute("developer", developer);
	}
	
	/*
	 Session Scope 에 올린 data(객체/literal)를 사용하려고 할 때, 
   메소드의 parameter에 @SessionAttribute 를 설정하면 Session Scope 에 저장된(올린) 
   객체(Bean:Spring Framework 가 관리하는 객체) 를 주입(Injection)받을 수 있음
	*/
	@GetMapping("/result5")
	// public void result5(HttpSession session) {
	public void result5(@SessionAttribute Developer developer) {
		
		// Developer developer = (Developer)session.getAttribute("developer");
		System.out.println("developer : " + developer);
	}
		
	@GetMapping("/test6")
	public void test6(HttpSession session, 
			              @ModelAttribute Developer developer) {
		
		developer.setName("안중근");
		developer.setAge(30);
		session.setAttribute("employee", developer);
	}
	
	/*
	 Session Scope 에 올린 data(객체/literal)를 사용하려고 할 때, 
   메소드의 parameter에 @SessionAttribute 를 설정하면 Session Scope 에 저장된(올린) 
   객체(Bean:Spring Framework 가 관리하는 객체) 를 주입(Injection)받을 수 있음
	*/
	@GetMapping("/result6")
	public void result6(@SessionAttribute("employee") Developer developer) {
		
		System.out.println("developer : " + developer);
	}
		
}
