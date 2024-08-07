package com.tjoeun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.beans.Mybatistbl;
import com.tjoeun.database.MapperInterface;

@Controller
public class MybatisController {
	
	@Autowired
	MapperInterface mapperInterface;
	
  @GetMapping("/input_data")
  public String input_data() {
  	return "input_data";
  }
  @PostMapping("/input_procedure")
  public String input_procedure(Mybatistbl mybatistbl) {
  	this.mapperInterface.insertData(mybatistbl);  	
  	return "input_success";
  }
  
  @GetMapping("/read_data")
  public String read_data(Model model) {
  	
  	List<Mybatistbl> memberList = mapperInterface.selectAll();
  	 
  	System.out.println("memberList : " + memberList);
  	System.out.println("===========================================");
  	
  	int count = 0;
  	for(Mybatistbl member : memberList) {
  		count++;
  		System.out.println(count + " 번 회원 : " + member);
  	}
  	
  	model.addAttribute("memberList", memberList);
  	
  	return "read_data";
  }
}







