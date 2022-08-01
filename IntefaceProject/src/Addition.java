
public class Addition implements Calculator {

	@Override
	public double perform(double a, double b) {
		System.out.println("Calculator - add " + (a + b));
		return a + b;

	}
}
	class Substraction implements Calculator {

		@Override
		public double perform(double a, double b) {
			System.out.println("calculator - sub " + (a - b));
			return a - b;
		}

	}


