package com.tjoeun.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tjoeun.database.MapperInterface;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// @Controller 어노테이션이 설정된 클래스를 
// Spring Framework 가 Controller 로 등록함
//                       ㄴ Spring 이 관리하는 Spring Container 의
//                          메모리에 자동으로 Controller 클래스의 객체를 생성함 
@EnableWebMvc
// Controller 클래스가 작성된 package 를 자동으로 scan 함
@ComponentScan("com.tjoeun.controller")
@PropertySource("/WEB-INF/properties/oracle.properties")
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${database.name}")
	private String dbClassName;
	
	@Value("${database.url}")
	private String dbURL;
	
	@Value("${database.username}")
	private String userName;
	
	@Value("${database.password}")
	private String password;
	
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
	
	// BasicDataSource 라는 클래스를 Bean 으로 등록하기
	// database 접속 관리 code 작성
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(this.dbClassName);
		source.setUrl(this.dbURL);
		source.setUsername(this.userName);
		source.setPassword(this.password);
		return source;		
	}
	
	// SqlSessionFactory 라는 클래스를 Bean 으로 등록하기
	//  ㄴ DB 접속 / sql(query) 관리
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
	// MapperInterface 를 제네릭으로 하는 
	// MapperFactoryBean 객체를 반환하는 메소드 작성하기
	// MapperFactoryBean<MapperInterface> 객체를 Bean 으로 등록하기
	@Bean
	public MapperFactoryBean<MapperInterface> mapperTest(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<MapperInterface> factoryBean = 
				new MapperFactoryBean<>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
}









