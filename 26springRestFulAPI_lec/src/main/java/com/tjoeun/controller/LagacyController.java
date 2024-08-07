package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LagacyController {

	@GetMapping("/controller")
	public String controller() {
		return "controller";
	}
}
