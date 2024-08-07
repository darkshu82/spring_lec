package com.tjoeun.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Developer {
	
	@Size(min=2, max=4)
  private String name;
	
	@Min(20) @Max(150)
  private int age;
	
}
