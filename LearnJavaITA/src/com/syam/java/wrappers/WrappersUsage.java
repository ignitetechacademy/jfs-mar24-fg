package com.syam.java.wrappers;

import java.util.List;

public class WrappersUsage {

	public static void main(String[] args) {
		
		String val = "200";
		int anotheValue = 150;
		
		System.out.println(val + anotheValue); //350 (expected) - 200150 (actual)
		
		int myNum = Integer.valueOf(val);
		System.out.println(myNum + anotheValue);
		
		
		int age = 20;
		byte studentAge = (byte) age;
		
		// int sales = 98;
		// byte salesValue = (byte)sales;
		
		Integer sales = 98;
		byte salesValue = sales.byteValue();
		
		int[] marks;
		//List<int> stdentMarks;
		List<Integer> stdentMarks;
	}
}
