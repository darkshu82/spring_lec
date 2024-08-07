package com.tjoeun.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Data
public class Developer {
	
	@NotEmpty
  private String name;
	
	@NotBlank
  private String id;
	
	@Positive
  private String age;
	
	@PositiveOrZero
  private String empno;
	
	@Negative
	private String orderno;
	
	@NegativeOrZero
	private String deptno;
	
	@Email
	private String email;
	
}
