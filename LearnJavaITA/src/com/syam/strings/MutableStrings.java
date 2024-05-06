package com.syam.strings;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Syam");
		System.out.println(sb);
		
		sb.append(" Kakumai");
		System.out.println(sb);
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("Ignite");
		System.out.println(sbuilder);
		
		sbuilder.append("Academy");
		System.out.println(sbuilder);
	}
}
