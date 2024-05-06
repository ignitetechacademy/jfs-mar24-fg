package com.syam.java.conditions;

public class ExploreSwitch {

	public static void main(String[] args) {

		String day = "hello";

		switch (day) {
		case "MON": {
			System.out.println("Monday - is a Working day");
			break;
		}
		case "TUE": {
			System.out.println("Tuesday - is a Working day");
			break;
		}
		case "SAT": {
			System.out.println("Saturday - is a Holi"
					+ " day");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}

	}
}
