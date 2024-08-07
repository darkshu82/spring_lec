package com.tjoeun.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Developer {
	
	@Size(min=2, max=4)
  private String name;
	
	@Max(150)
  private String age;
	
}
