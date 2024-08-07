package com.tjoeun.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	
	@GetMapping("/saveCookie")
	public String saveCookie(HttpServletResponse response) {
		
		try {
			String name1 = URLEncoder.encode("이순신", "UTF-8");
			String name2 = URLEncoder.encode("강감찬", "UTF-8");
			
			Cookie cookie1 = new Cookie("cookie1", name1);
			Cookie cookie2 = new Cookie("cookie2", name2);
			
			cookie1.setMaxAge(60 * 60 * 24 * 365);
			cookie2.setMaxAge(60 * 60 * 24 * 365);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "saveCookie";
	}
  
	@GetMapping("/loadCookie")
	public void loadCookie(HttpServletRequest request) {
		
		try {
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies) {
				String name = URLDecoder.decode(cookie.getValue(), "UTF-8");
				if(cookie.getName().equals("cookie1")) {
					System.out.printf("cookie1 : %s%n", name);
				}else if(cookie.getName().equals("cookie2")) {
					System.out.printf("cookie2 : %s%n", name);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@GetMapping("/loadCookie2")
	public void loadCookie2(@CookieValue("cookie1") String cookie1,
			                    @CookieValue("cookie2") String cookie2) {
		
		System.out.printf("cookie1 : %s%n", cookie1);
		System.out.printf("cookie2 : %s%n", cookie2);
		  
	}
  
}

