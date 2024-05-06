package com.syam.strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Ignite#Tech#Academy#Bangalore", "#");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		
	}
}
