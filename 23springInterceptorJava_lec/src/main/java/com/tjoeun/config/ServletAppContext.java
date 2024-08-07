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

import com.tjoeun.interceptor.InterceptorTest01;
import com.tjoeun.interceptor.InterceptorTest02;
import com.tjoeun.interceptor.InterceptorTest03;
import com.tjoeun.interceptor.InterceptorTest04;
import com.tjoeun.interceptor.InterceptorTest05;
import com.tjoeun.interceptor.InterceptorTest06;
import com.tjoeun.interceptor.InterceptorTest07;
import com.tjoeun.interceptor.InterceptorTest08;
import com.tjoeun.interceptor.InterceptorTest09;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// @Controller 어노테이션이 설정된 클래스를 
// Spring Framework 가 Controller 로 등록함
//                       ㄴ Spring 이 관리하는 Spring Container 의
//                          메모리에 자동으로 Controller 클래스의 객체를 생성함 
@EnableWebMvc
// Controller 클래스가 작성된 package 를 자동으로 scan 함
@ComponentScan("com.tjoeun.controller")
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
	
	// Interceptor 를 Bean 으로 등록하기
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		
		InterceptorTest01 interceptor1 = new InterceptorTest01();
		InterceptorTest02 interceptor2 = new InterceptorTest02();
		InterceptorTest03 interceptor3 = new InterceptorTest03();
		InterceptorTest04 interceptor4 = new InterceptorTest04();
		InterceptorTest05 interceptor5 = new InterceptorTest05();
		InterceptorTest06 interceptor6 = new InterceptorTest06();
		InterceptorTest07 interceptor7 = new InterceptorTest07();
		InterceptorTest08 interceptor8 = new InterceptorTest08();
		InterceptorTest09 interceptor9 = new InterceptorTest09();
		
		InterceptorRegistration  regi1 = registry.addInterceptor(interceptor1);
		InterceptorRegistration  regi2 = registry.addInterceptor(interceptor2);
		InterceptorRegistration  regi3 = registry.addInterceptor(interceptor3);
		InterceptorRegistration  regi4 = registry.addInterceptor(interceptor4);
		InterceptorRegistration  regi5 = registry.addInterceptor(interceptor5);
		InterceptorRegistration  regi6 = registry.addInterceptor(interceptor6);
		InterceptorRegistration  regi7 = registry.addInterceptor(interceptor7);
		InterceptorRegistration  regi8 = registry.addInterceptor(interceptor8);
		InterceptorRegistration  regi9 = registry.addInterceptor(interceptor9);
		
		// URL Pattern 등록하기
		regi1.addPathPatterns("/interceptor_test1");
		regi2.addPathPatterns("/interceptor_test1");
		regi3.addPathPatterns("/interceptor_test1");
		regi4.addPathPatterns("/interceptor_test2");
		// regi5.addPathPatterns("/interceptor_test2");
		
		regi5.addPathPatterns("/interceptor_test1", "/interceptor_test2");
		regi6.addPathPatterns("/interceptor/interceptor_test3", 
				                  "/interceptor/interceptor_test4");
		
		regi7.addPathPatterns("/*");
		regi8.addPathPatterns("/interceptor/*");
		regi9.addPathPatterns("/**");
		regi9.excludePathPatterns("/*");
				   
	}

}









