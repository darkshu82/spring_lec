package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
Controller 클래스에서 메소드 작성하는 방법

접근제한자는 public 
return type 은 일반적으로 String

Controller 클래스에 작성한 메소드가 호출될 때는
메소드 이름으로 구분해서 호출되는 것이 아니고
메소드 이름 위에 설정한 Annotation 인
@RequestMapping
@GetMapping
@PosetMapping
에 지정한 url pattern 으로 호출됨
  ㄴ 설정해 놓은 url pattern 과
     Client 로부터 들어오는 request 의 url 이 
     일치하면 자동으로 호출됨
*/
@Controller
public class HomeController {
	
	// @RequestMapping(value="/", method=RequestMethod.GET)
	// @RequestMapping(value="/", method=RequestMethod.POST)
	// @PostMapping("/")
	@GetMapping("/")
	public String home() {
		System.out.println("home");
		return "index";
	}

}





