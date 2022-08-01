package com.wellsfargo.main;

import java.util.Scanner;

public class WhileLoop {

	private void envOdd() {
		System.out.println("This will be even odd method");
	}

	private void add() {
		System.out.println("This will be add two no. program");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		WhileLoop loop = new WhileLoop();
//	
//		for(; i < 10; i++) {
//			System.out.println(i);
//		}

//		int i = 0;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
		int i = 0;
		do {
			System.out.println("==== game ====");
			System.out.println("1. Even Odd");
			System.out.println("2. Add two numbers");
			System.out.println("3. Exit");
			System.out.println("==== ==== ====");
			i = scanner.nextInt();

			switch (i) {
			case 1: {
				loop.envOdd();
				break;
			}
			case 2:
				loop.add();
				break;
			default:
				if (i != 3) {
					System.out.println("wrong choice!");
				}
			}

		} while (i != 3);
		System.out.println("Thanks for playing...");

	}

	// Write a program "Calculator" which will take
	//input from user and do add/subtract/multiply and division

}
