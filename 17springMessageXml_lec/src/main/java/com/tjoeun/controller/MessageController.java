package com.tjoeun.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	 // MessageSource 주입 받기
	 @Autowired          
   ReloadableResourceBundleMessageSource res;

	@GetMapping("/test1")
	public String test1(Model model, Locale locale) {
		System.out.println("locale  : " + locale);
		
		String name1 = res.getMessage("person.name", null, null);
		String name2 = res.getMessage("student.name", null, null);
		
		int age1 = Integer.parseInt(res.getMessage("person.age", null, null));
		int age2 = Integer.parseInt(res.getMessage("student.age", null, null));
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("age1  : " + age1);
		System.out.println("age2  : " + age2);
		
		System.out.println("-----------------------------------");
		
		Object[] infos = {"더조은", 23};
		String strInfos = res.getMessage("person.info", infos, null);
		System.out.println("strInfos : " + strInfos);
		
		System.out.println("-----------------------------------");
		
		String lg = res.getMessage("person.lg", null, locale);
		System.out.println("lg : " + lg);
		
		model.addAttribute("infos", infos);
		
		return "test1";     
	}
}




