package com.tjoeun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// @Controller 어노테이션이 설정된 클래스를 
// Spring Framework 가 Controller 로 등록함
//                       ㄴ Spring 이 관리하는 Spring Container 의
//                          메모리에 자동으로 Controller 클래스의 객체를 생성함 
@EnableWebMvc
// Controller 클래스가 작성된 package 를 자동으로 scan 함
@ComponentScan("com.tjoeun.controller")
@ComponentScan("com.tjoeun.exception")
public class ServletAppContext implements WebMvcConfigurer{
	
	// Controller 의 메소드가 반환하는 jsp(view) 이름 앞뒤로
	// 있는 경로의 접두사, 접미사 설정하기
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
  	
	// 이미지, 음악파일, js, css 파일 등을 저장하는 경로 지정하기
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
  //Properties 파일 Message 로 등록하기
	// ReloadableResourceBundleMessageSource 사용하기
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource res = 
				new ReloadableResourceBundleMessageSource();
		
		// properties 파일 하나 등록하는 경우
		res.setBasename("/WEB-INF/properties/error_messages");
		
		// properties 파일 여러 개 등록하는 경우
	  // res.setBasenames("/WEB-INF/properties/test1",
	  // 		             "/WEB-INF/properties/test2");
		return res;
	}
	
	
}









