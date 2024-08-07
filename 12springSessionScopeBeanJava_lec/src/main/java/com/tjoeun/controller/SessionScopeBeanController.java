package com.tjoeun.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tjoeun.beans.Developer;
import com.tjoeun.beans.Officer;
import com.tjoeun.beans.Professor;
import com.tjoeun.beans.Student;

@Controller
public class SessionScopeBeanController {
	
	@Autowired
	Developer developer;
	
	@Resource(name="sophomore")
	Student sophomore;
	
	@Autowired
	Professor professor;
	
	@Resource(name="policeman")
	Officer policeman;
	
	
	@GetMapping("/test1")
	public String test1() {
	
		developer.setEmpno("2024-100");
		developer.setEname("강감찬");
		developer.setAge(72);
		
		sophomore.setStudno("123456");
		sophomore.setName("양만춘");
		sophomore.setDepartment("인공지능학과");		
		
		professor.setProfNo("2000-200");
		professor.setProfName("장영실");
		professor.setDepartment("빅데이터학과");

		policeman.setName("김춘추");
		policeman.setAddress("경주");
		policeman.setHeight(182);
		
		System.out.println("developer : " + developer);
		System.out.println("sophomore : " + sophomore);
		System.out.println("professor : " + professor);
		System.out.println("policeman : " + policeman);
		
		return "test1";
	}
	@GetMapping("/result1")
	public String result1(Model model) {
		System.out.println("developer : " + developer);
		System.out.println("sophomore : " + sophomore);
		System.out.println("professor : " + professor);
		System.out.println("policeman : " + policeman);
		
		// jsp 에서 값을 확인하려면
		// model.addAttribute() 로 request scope 에 올려야 됨
		model.addAttribute("developer", developer);
		model.addAttribute("sophomore", sophomore);
		model.addAttribute("professor", professor);
		model.addAttribute("policeman", policeman);
		   
		return "result1";
	}

}
