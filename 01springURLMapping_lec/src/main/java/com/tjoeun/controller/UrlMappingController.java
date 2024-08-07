package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlMappingController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/abc")
	public String abc() {
		return "abc";
	}
	
	@PostMapping("/abc")
	public String post() {
		return "post";
	}

	// return type 을 void 로 하면
	// url pattern 에 지정한 문자열과
	// 같은 이름의 jsp 파일이 있는 경우
	// return 값으로 그 이름을 지정하지 않아도
	// 같은 이름의 jsp 파일이 열림
	@GetMapping("/tjoeun")
	public void tjoeun() { }
	
	@GetMapping("/tjoeun/test2")
	public String tjoeunTest2() {
		return "tjoeun/test2";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}
}
