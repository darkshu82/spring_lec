package com.tjoeun.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tjoeun.dto.Developer;

@Controller
public class VaidationController {
	
	@PostMapping("/validation_procedure")
	public String validation_procedure(@Valid Developer developer, 
			                               BindingResult result) {
		if(result.hasErrors()) {
			return "validation_test1";
		}
		return "validation_success";
	}
	       
	@GetMapping("/validation_test1")
	public String validation_test1() {
		return "validation_test1";
	}
	
	@GetMapping("/validationSpringCustomForm")
	public String validationSpringCustomForm(Developer developer) {
		// model.addAttribute("developer", developer);
		return "validationSpringCustomForm";
	}
	            
}





