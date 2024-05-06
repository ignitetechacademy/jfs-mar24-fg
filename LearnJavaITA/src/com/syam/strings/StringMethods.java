package com.syam.strings;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Syam Kakumani";
		System.out.println(name);
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.substring(4));
		System.out.println(name.contains("Syam"));
		System.out.println(name.concat(" ,Ignite Tech"));
	}
}
