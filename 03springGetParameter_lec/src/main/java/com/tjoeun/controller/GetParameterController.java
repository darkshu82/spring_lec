package com.tjoeun.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Controller
public class GetParameterController {
	
	
	
	/*
	  내장 객체 HttpServletRequest 사용하기
	    ㄴ request scope 에 있는 data 를 가져옴
	    
	  Controller 클래스의 메소드의 parameter 에
	  class 나 interface type 을 지정하면
	  해당 type 의 객체를 Spring Framework 가 
	  자동으로 생성해서 할당해 줌 <-- 이것을 주입(Injection) 이라고 함
	    
	*/
	@GetMapping("/paramtest1")
	public String paramtest1(HttpServletRequest request) {
		
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		String[] nums  = request.getParameterValues("nums");
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		System.out.println("nums : " + Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n============================");
		
		for(String number : nums) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
			
		
		return "result";		
	}

	@PostMapping("/paramtest2")
	public String paramtest2(@ModelAttribute HttpServletRequest request) {
		
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		String[] nums  = request.getParameterValues("nums");
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		System.out.println("nums : " + Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n============================");
		
		for(String number : nums) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
		
		return "result";		
	}
	
	@GetMapping("/student")
  public String student(@ModelAttribute Student student) {
		student.setName("더조은");
		student.setAge(25);
		student.setAddress("종로");
	  System.out.println("student : " + student.toString());
		return "student";
	}
	
	@GetMapping("/paramtest3")
	public String paramtest3(@RequestParam int number1,
                      		 @RequestParam int number2,
                      		 @RequestParam int[] nums) {
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		System.out.println("합 계   : " + (number1 + number2));
		System.out.println("nums : " + Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n============================");
		
		for(int number : nums) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
		
		return "result";
	}
	
	@PostMapping("/paramtest4")
	public String paramtest4(@RequestParam int number1,
                      		 @RequestParam int number2,
                      		 @RequestParam int[] nums) {
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		System.out.println("합 계   : " + (number1 + number2));
		System.out.println("nums : " + Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n============================");
		
		for(int number : nums) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
		
		return "result";
	}
	
	@GetMapping("/paramtest5")
	public String paramtest5(@RequestParam("number1") int num1,
                      		 @RequestParam(value="number2") int num2,
                      		 @RequestParam("nums") int[] numbers) {
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("합 계   : " + (num1 + num2));
		System.out.println("numbers : " + Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n============================");
		
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
		
		return "result";
	}
	
	@GetMapping("/paramtest6")
	public String paramtest6(@RequestParam("number1") int num1,
                      		 @RequestParam(value="number2") int num2,
                      		 @RequestParam("nums") int[] numbers,
                      		 @RequestParam(defaultValue="더조은") String name) {
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("합 계   : " + (num1 + num2));
		System.out.println("numbers : " + Arrays.toString(numbers));
		System.out.println("name : " + name);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n============================");
		
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
		
		return "result";
	}
	
	@GetMapping("/paramtest7")
	public String paramtest7(@RequestParam("number1") int num1,
                      		 @RequestParam(value="number2") int num2,
                      		 @RequestParam("nums") int[] numbers,
                      		 @RequestParam(required=false) String name) {
		
	  name = "이순신";
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("합 계   : " + (num1 + num2));
		System.out.println("numbers : " + Arrays.toString(numbers));
		System.out.println("name : " + name);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n============================");
		
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("\n============================");
		
		return "result";
	}
	
}

@Getter @Setter @ToString
class Student{
	private String name;
	private int age;
	private String address;	
}


