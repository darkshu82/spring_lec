package com.tjoeun.beans;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[ ]args) {
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "자바");
		map1.put(2, "파이썬");
		map1.put(3, "오라클");

		map1.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("-------------------------------------");
		
		map1.put(4, "HTML");
		map1.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("-------------------------------------");
		
		map1.put(2, "Spring Framework");
		map1.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
