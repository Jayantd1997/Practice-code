import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("====Vehicle Program=====");
			System.out.println("1.Bike");
			System.out.println("2.Car");
			System.out.println("3.Cycle");
			System.out.println("4.exit");

			Vehicle vehicle = null;
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			// use your choice in switch case by adding runtime obj
			// in ref of interface

			switch (choice) {
			case 1:
				vehicle = new Bike();

				break;
			case 2:
				vehicle = new Car();

				break;
			case 3:
				vehicle = new Cycle();

				break;
			case 4:
				System.out.println("exit");
				System.exit(1);

			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to start the engine?");
			String ans = sc.next();

			if (ans.charAt(0) == 'y') {
				vehicle.start();

			}

		} while (true);

	}

}
