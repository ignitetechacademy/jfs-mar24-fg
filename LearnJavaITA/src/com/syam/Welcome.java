package com.syam;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome to STS IDE, Syam");
		System.out.println("Syam Kakuamni");
		
		String location = "Bangalore"; 
		System.out.println(location);

		String name = args[0]; 
		System.out.println(name);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your college Name :");
		String cName = scan.nextLine();
		System.out.println("You sudied in "+ cName);
		
		System.err.println("Hello");

	}
}
