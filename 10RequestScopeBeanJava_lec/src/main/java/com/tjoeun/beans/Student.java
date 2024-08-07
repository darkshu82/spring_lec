package com.tjoeun.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;

@Component
@RequestScope
@Data
public class Student {
	private String memberNum;
  private String name;
  private String id;
  private String pw;
  private String phone;
  private String address;
}
