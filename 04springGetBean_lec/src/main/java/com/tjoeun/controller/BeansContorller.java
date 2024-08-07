package com.tjoeun.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tjoeun.beans.Developer;

@Controller
public class BeansContorller {
	
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map1,
			                @RequestParam("num3") List<String> list1) {
		
		String num1 = map1.get("num1");
		String num2 = map1.get("num2");
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		for(String strNumber : list1) {
			System.out.print(strNumber + " ");
		}
		System.out.println("\n------------------------------");
		
		return "test1";
	}
	@GetMapping("/test2")
	public String test2(int num1, int num2,
			                @RequestParam Map<String, String> map1,
			                @RequestParam("num3") List<String> list1) {
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		String number1 = map1.get("num1");
		String number2 = map1.get("num2");
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		
		for(String strNumber : list1) {
			System.out.print(strNumber + " ");
		}
		System.out.println("\n------------------------------");
		
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(Developer developer) {
		
		System.out.println(developer);
		
		return "test3";
	}
	

}


  

