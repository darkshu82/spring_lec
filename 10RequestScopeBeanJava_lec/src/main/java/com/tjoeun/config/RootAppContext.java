package com.tjoeun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.tjoeun.beans.CollegeStudent;
import com.tjoeun.beans.Member;

// project 작업할 때 생성하는 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	@Bean
	@RequestScope
	public Member member() {
		return new Member();
	}
	
	@Bean("sophomore")
	@RequestScope
	public CollegeStudent collegeStudent() {
		return new CollegeStudent();
	}

}

