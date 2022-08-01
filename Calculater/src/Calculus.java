import java.util.Scanner;

public class Calculus {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("===== Calculator =====");
			System.out.println("1.add");
			System.out.println("2.multiply");
			System.out.println("3.substract");
			System.out.println("4.exit");

			int choice = sc.nextInt();

			if (choice != 4) {
				System.out.println("Enter 1 number");
				number1 = sc.nextInt();

				System.out.println("Enter 2 number");
				number2 = sc.nextInt();
			}

			switch (choice) {
			case 1: {
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;
			}
			case 2: {
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;
			}
			case 3: {
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;
			}
			case 4: {
				System.out.println("Terminated!");
				System.exit(1);
			}
			default:
				System.out.println("Invalid number");
				break;
			}
		} while (true);

	}

}
