package com.wellsfargo.main;

import java.util.Arrays;

import com.wellsfargo.enums.Week;

public class Main {

	public static void main(String[] args) {
		
		int day = Week.valueOf("SUNDAY").getValue();

		switch (day) {
		case 1:
		case 2:
		case 3:
			System.out.println("case 3 executed...");
			System.out.println(Arrays.toString(Week.values()));
			break;
		case 7:
			System.out.println("This is executed");
			break;
		default:
			System.out.println("default case executed...");
			break;
		}

	}

}
