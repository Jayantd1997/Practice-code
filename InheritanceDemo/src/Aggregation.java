class Operation {
	int square(int num) {
		return num * num;
	}
}

public class Aggregation {

	double pi = 3.14;
	Operation operation;

	double area(int radius) {
		operation = new Operation();
		return pi * operation.square(radius);
	}

	public static void main(String[] args) {
		double aoc = new Aggregation().area(23);
		System.out.println("Area of Circle: " + aoc);
		System.out.println("Square root of 81: " + Math.sqrt(81));
		// HW: Write program to illustrate composition of
		// right angle triangle
	}
}
