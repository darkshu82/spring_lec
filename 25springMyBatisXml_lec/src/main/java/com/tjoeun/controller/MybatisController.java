package com.tjoeun.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.beans.Mybatistbl;

@Controller
public class MybatisController {
	
	// xml 방식에서는 MapperInterface 를 사용하지 않고
	// SqlSessionTemplate 객체를 사용함
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
  @GetMapping("/input_data")
  public String input_data() {
  	return "input_data";
  }
  @PostMapping("/input_procedure")
  public String input_procedure(Mybatistbl mybatistbl) {
  	this.sqlSessionTemplate.insert("myBatisDatabase.insertMember", mybatistbl);  	
  	return "input_success";
  }
  
  @GetMapping("/read_data")
  public String read_data(Model model) {
  	
  	List<Mybatistbl> memberList = 
  			this.sqlSessionTemplate.selectList("myBatisDatabase.selectAll");
  	 
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







