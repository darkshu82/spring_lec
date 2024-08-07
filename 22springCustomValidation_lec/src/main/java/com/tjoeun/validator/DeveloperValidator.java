package com.tjoeun.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tjoeun.dto.Developer;

public class DeveloperValidator implements Validator{
  
	// supports() : 유효성 검사 대상 객체가 유효성 검사를 할 수 있는 객체인지 확인함
	@Override
	public boolean supports(Class<?> clazz){
		return Developer.class.isAssignableFrom(clazz);
	}
	
	// validate() : 유효성 검사를 수행함
	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors,"dname","EmptyError");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"mgrName","EmptyWhiteError");
		
		Developer developer = (Developer)target;
		
		String address = developer.getAddress();
		String email = developer.getEmail();
		
		if(address.length() > 20) {
			errors.rejectValue("address", "Length20");
		}
		if(email.contains("@") == false) {
			errors.rejectValue("email", "ContainsAtSign");
		}
		
		
		
	}
}





