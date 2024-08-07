package com.tjoeun.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class InterceptorTest01 implements HandlerInterceptor{
	
	/*
	  preHandle() / postHandle() / afterCompletion() 
	*/
	
	/*
	Controller 의 메소드가 호출되기 전에 호출됨
                이 메소드에서 false 을 반환하면 code 의 흐름이 중단되어서
                더 이상 진행하지 않음 <-- Controller 로 넘어가지 않음
                                          이후에 호출되는 다른 interceptor 들도 
                                          실행되지 않음 
	*/
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("InterceptorTest01 - preHandle() 메소드");
		return true;   
	}
	/*
	Controller 의 메소드가 호출된 후, 
                 view 처리를 수행하기 전(화면으로 넘어가기 전)에 호출됨
	*/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("InterceptorTest01 - postHandle() 메소드");
	}
	
	/*
	view 처리가 완료되고(화면으로 넘어감)
                      client 쪽으로 응답결과가 response 되기 전에 호출됨
	*/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("InterceptorTest01 - afterCompletion() 메소드");
	}
	
}


