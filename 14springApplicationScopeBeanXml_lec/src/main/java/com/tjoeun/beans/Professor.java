package com.tjoeun.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Component
@SessionScope
@Data
public class Professor {
  private String profNo;
  private String profName;
  private String department;
}
