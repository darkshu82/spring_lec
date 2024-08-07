package com.tjoeun.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandling() {
		return "error_page2";
	}
	
}
