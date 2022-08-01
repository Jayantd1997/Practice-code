class Addition {
	int perform(int a, int b) {
		return a + b;
	}
}

class Substraction {
	int perform(int a, int b) {
		return a - b;
	}
}

class Multiplication {
	int perform(int a, int b) {
		return a * b;
	}
}

class Divison {
	int perform(int a, int b) {
		return a / b;
	}
}

public class Calculator {
	int a;
	int b;
	Addition addition;
	Substraction substraction;
	Multiplication multiplication;
	Divison divison;

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println("addition of a and b:" + addition.perform(4, 3));

	}

}
