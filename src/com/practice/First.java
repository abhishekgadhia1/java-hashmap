package com.practice;

import java.util.HashMap;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "abhishek");
		map.put(2, "chinmay");
		map.put(3, "yash");
		
		String v1 = map.get(1);
		String v2 = map.get(2);
		String v3 = map.get(3);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		

	}

}
