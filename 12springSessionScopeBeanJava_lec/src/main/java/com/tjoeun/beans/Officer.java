package com.tjoeun.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Component(value="policeman")
@SessionScope
@Data
public class Officer {
	private String name;
	private String address;
	private int height;
}
