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
public class ApplicationScopeBeanController {
	
	@Autowired
	Developer developer;
	
	@Resource(name="sophomore")
	Student sophomore;
	
	@Autowired
	Professor professor;
	
	@Resource(name="policeman")
	Officer policeman;

	@GetMapping("/test1")
	public void test1() {
		developer.setName("이순신");
		developer.setAge(46);
		
		sophomore.setStudno("2024-222");
		sophomore.setName("정약용");
		sophomore.setDepartment("컴퓨터공학과");
		
		professor.setProfNo("2024-5555");
		professor.setProfName("이율곡");
		professor.setDepartment("개발부");
		
		policeman.setName("이황");
		policeman.setAddress("서울");
		policeman.setHeight(176);
		
	}
	
  @GetMapping("/result1")
  public void result1(Model model) {
  	System.out.printf("developer : %s%n", developer);
  	System.out.printf("sophomore : %s%n", sophomore);
  	System.out.printf("professor : %s%n", professor);
  	System.out.printf("policeman : %s%n", policeman);
  	
  	model.addAttribute("developer", developer);
  	model.addAttribute("sophomore", sophomore);
  	model.addAttribute("professor", professor);
  	model.addAttribute("policeman", policeman);
  }
     
}


