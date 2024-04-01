package com.syam.java.variables;

public class ExploreVariables {

	public static void main(String[] args) {

		// input marks & name, out put is total, percentage, pass / fail

		String name = "Syam";
		int maths = 83;
		int science = 72;
		int computers = 54;
		int language = 34;

		int total = maths + science + computers + language;
		System.out.println("Total MArks : " + total);

		if (maths > 35 && science > 35 && computers > 35 && language > 35) {
			System.out.println(name + " is passed");
		} else {
			System.out.println(name + " failed");
		}

		float percentage =   (float) total / 4 ;
		System.out.println("Percentage  " + percentage);

	}

}
