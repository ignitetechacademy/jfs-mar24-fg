package com.syam.strings;

public class StringFormat {
	public static void main(String[] args) {

		String name = "syam";
		System.out.println("My name is : " + name);

		int number = 12345;
		System.out.println("My number is : " + number);

		System.out.println("my name is (" + name + "), my number is (" + number + ")");
		
		System.out.printf("My name is : %s", name);
		System.out.printf("\nMy number is : %d", number);
		System.out.printf("\nmy name is (%s), my number is (%d)", name, number);
		
		//System.out.println("my name is (" + name + "), my number is (" + number + ")");
	}
}
