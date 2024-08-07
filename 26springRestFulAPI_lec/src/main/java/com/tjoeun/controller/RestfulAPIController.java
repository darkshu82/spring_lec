package com.tjoeun.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tjoeun.beans.Developer;

@RestController
public class RestfulAPIController {
  @GetMapping("/restController")
  public String restController() {
  	// restController.jsp 를 찾아가는 것이 아니고
  	// restController 라는 문자열을 반환함
  	return "restController";
  }
  
  @GetMapping("/restController2")
  public ResponseEntity<ArrayList<Developer>> restController2() {
    	
  	Developer developer1 = new Developer("이순신", 1545, 192, true);
  	Developer developer2 = new Developer("강감찬", 948, 175, true);
  	Developer developer3 = new Developer("유관순", 1902, 172, false);
  	
  	ArrayList<Developer> dList = new ArrayList<>();
  	dList.add(developer1);
  	dList.add(developer2);
  	dList.add(developer3);
  	
  	/*
  	  ResponseEntity : HttpEntity 를 상속한 클래스
                       client 의 request 에 대한 응답정보를 저장하는 클래스
                       http 프로토콜을 준수하는 response 메세지를 생성함
                       response(응답정보) 를 모두 담은 data 들을
                       객체로 생성해서 반환함    
                         ㄴ HttpStatus, HttpHeaders, HttpBody 를 포함함
                       
     HttpEntity 를 상속한 클래스 - RequestEntity / ResposeEntity                                  
  	*/
  	ResponseEntity<ArrayList<Developer>> responseEntity = 
  	  new ResponseEntity<ArrayList<Developer>>(dList, HttpStatus.OK);
  	
  	return responseEntity;
  }
  
  
  
}
