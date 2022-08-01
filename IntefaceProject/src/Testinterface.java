
public class Testinterface {

	public static void main(String[] args) {
		Calculator calculator = new Addition();
		double a = 5;
		double b = 4;
		calculator.perform(a, b);
		calculator.clean();
		Calculator.print();

	}

}
