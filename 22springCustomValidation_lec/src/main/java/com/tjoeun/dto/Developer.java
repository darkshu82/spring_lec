package com.tjoeun.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Developer {
	
	@Size(min=2, max=4)
  private String name;
	
	private String dname;
	private String mgrName;
	
	private String address;
	private String email;
	
}
