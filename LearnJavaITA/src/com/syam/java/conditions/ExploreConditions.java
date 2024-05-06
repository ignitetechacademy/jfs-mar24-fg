package com.syam.java.conditions;

public class ExploreConditions {
	public static void main(String[] args) {
		// >   >=   <  <=  ==  !=
		
		int marks = 51;
		boolean con = marks > 50;
		
		//if(con) {
		if(marks > 49) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		System.out.println("program execution completed");
	}
}
