class Car {
	void run() {
		System.out.println("car is running");
	}
}

class Hyundai extends Car {
	void brand() {
		System.out.println("brand name is hyundai");
	}
}

class Creta extends Hyundai {
	void print() {
		System.out.println("name of car is creta");
	}
}

public class Inheritance {
// multilevel inheritances
//	Car -> Hyundai -> Creta
	public static void main(String[] args) {
		Creta c = new Creta();
		c.run();
		c.brand();
		c.print();
	}
}
