package com.tjoeun.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.beans.Developer;
import com.tjoeun.beans.InfoClass;
import com.tjoeun.beans.Student;

@Controller
public class FormElementController {
	
	@GetMapping("/test1")
	public String test1(Student student) {
		
		student.setNumber(875421);
		student.setName("강감찬");
		student.setId("kang");
		student.setPw("123456");
		student.setPost("강감찬 학생이 올린 게시글");
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(InfoClass infoClass, Model model) {
		
		// test2.jsp 에서
		// select 태그의 기본값 설정하기
		infoClass.setS1("info2");
		infoClass.setS2("info2");
		infoClass.setS3("info3");
		
		String[] infoArray1 = new String[]{"info1", "info2", "info3"};
		model.addAttribute("infoArray1", infoArray1);
		        
		List<String> infoList2 = new ArrayList<>();
		infoList2.add("info1");
		infoList2.add("info2");
		infoList2.add("info3");
		model.addAttribute("infoList2", infoList2);
		
		Developer developer1 = new Developer();
		Developer developer2 = new Developer();
		Developer developer3 = new Developer();
		
		developer1.setEmpno("0001");
		developer1.setEname("이순신");
		developer2.setEmpno("0002");
		developer2.setEname("유관순");
		developer3.setEmpno("0003");
		developer3.setEname("장영실");
		
		List<Developer> developer_list = new ArrayList<>();
		developer_list.add(developer1);    
		developer_list.add(developer2);      
		developer_list.add(developer3);
		model.addAttribute("developer_list",developer_list);
		
		String[] infoArray2 = new String[] {"info1", "info3"};
		infoClass.setS5(infoArray2);
		infoClass.setS6(infoArray2);   
		infoClass.setS7(infoArray2);
		infoClass.setS8(infoArray2);
		
		infoClass.setS9("info2");
		infoClass.setS10("info2");
		infoClass.setS11("info2");
		infoClass.setS12("info2");
		
		return "test2";
	}
	
	@PostMapping("/result")
	public String result(Student student) {
		return "result";				
	}

	@PostMapping("/result2")
	public String result2() {
		
		return "result2";				
	}
	
}
