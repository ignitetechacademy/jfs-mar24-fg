package com.syam.java.conditions;

public class ExploreNestedConditions {

	public static void main(String[] args) {

		int percentage = 47;

		if (percentage > 50) {
			System.out.println("Passed");

			if (percentage > 50 && percentage < 80) {
				System.out.println("B grade");
			} else {
				System.out.println("A grade");
			}

		} else {
			System.out.println("Fail");
		}
	}
}
