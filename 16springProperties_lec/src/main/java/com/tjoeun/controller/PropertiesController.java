package com.tjoeun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
  properties 파일에 작성한 내용을 사용하고자 하는
  클래스 위에 @PropertySource/@PropertySources 라는 annotation 을 설정함
 */
@Controller
/*
@PropertySource("/WEB-INF/properties/test1.properties")
@PropertySource("/WEB-INF/properties/test2.properties")
*/
@PropertySources({
	   @PropertySource("/WEB-INF/properties/test1.properties"), 
		 @PropertySource("/WEB-INF/properties/test2.properties")
})

public class PropertiesController {
	
	@Value("${person.name}")
	private String name;
	
	@Value("${person.age}")
	private int age;
	
	@Value("${student.name2}")
	private String name2;
	
	@Value("${student.age2}")
	private int age2;
	
	@Value("${female.name3}")
  private String name3;
	
	@Value("${female.age3}")
	private int age3;
	
	@Value("${male.name4}")
  private String name4;
	
	@Value("${male.age4}")
	private int age4;
	
	
			
	@GetMapping("/propertiesTest")
	public void propertiesTest() {
		
		System.out.println("person.name : " + this.name);
		System.out.println("person.age  : " + this.age);
		
		System.out.println("student.name2 : " + this.name2);
		System.out.println("student.age2  : " + this.age2);

		System.out.println("female.name3 : " + this.name3);
		System.out.println("female.age3  : " + this.age3);
		
		System.out.println("male.name4 : " + this.name4);
		System.out.println("male.age4  : " + this.age4);
	}

}



