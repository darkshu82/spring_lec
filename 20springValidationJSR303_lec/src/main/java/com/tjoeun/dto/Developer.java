package com.tjoeun.dto;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Developer {
	
	@Size(min=2, max=4)
  private String name;
	
	@Pattern(regexp="[a-zA-Z0-9가-힣]*")
	private String id;
	
	@Max(150)
	@Min(20)
  private String age;
	
	@DecimalMax(value="180", inclusive=false)
	@DecimalMin(value="160", inclusive=false)
	private String height;
	
	@Null
	private String dname;
	
	@NotNull
	private String deptno;
	
	@Digits(integer=5, fraction=4)
	private String devNumber;
	
	
	
	@AssertTrue
	private boolean married;
	
	@AssertFalse
	private boolean gradudated;
	
	
	
	
	
	
}
