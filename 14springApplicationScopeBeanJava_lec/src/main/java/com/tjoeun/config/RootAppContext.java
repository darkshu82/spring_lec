package com.tjoeun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import com.tjoeun.beans.Developer;
import com.tjoeun.beans.Student;

// project 작업할 때 생성하는 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	@Bean
	@ApplicationScope
	public Developer developer() {
		return new Developer();
	}
	
	@Bean("sophomore")
	@ApplicationScope
	public Student student() {
		return new Student();
	}
	

}
