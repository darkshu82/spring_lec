package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorController {
	@GetMapping("/interceptor_test1")
	public String interceptor_test1() {
		System.out.println("InterceptorController - interceptor_test1()");
		return "interceptor_test1";
	}
	
	@GetMapping("/interceptor_test2")
	public String interceptor_test2() {
		System.out.println("InterceptorController - interceptor_test2()");
		return "interceptor_test2";
	}
	
	@GetMapping("/interceptor/interceptor_test3")
	public String interceptor_interceptor_test3() {
		System.out.println("InterceptorController - interceptor_test3()");
		return "interceptor/interceptor_test3";
	}
	
	@GetMapping("/interceptor/interceptor_test4")
	public String interceptor_interceptor_test4() {
		System.out.println("InterceptorController - interceptor_test4()");
		return "interceptor/interceptor_test4";
	}
	   
	
}
