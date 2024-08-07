package com.tjoeun.beans;

import lombok.Data;

@Data 
public class Developer {
	String name;
	int age;
	double height;
	double weight;
	String company;
	String[] majorLanguages;
}
