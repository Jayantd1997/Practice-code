class Oprand {
	double square(double sideA, double sideB) {
		return (sideA * sideA) + (sideB * sideB);
	}
}

public class Hypotense {
	double sideA;
	double sideB;
	Oprand operation;

	Hypotense(double sideA, double sideB) {
		// TODO Auto-generated constructor stub
		this.sideA = sideA;
		this.sideB = sideB;

	}

	double hypotense() {
		operation = new Oprand();
		return Math.sqrt(operation.square(sideA, sideB));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sideC = new Hypotense(4, 3).hypotense();
		System.out.println("hypotense of triangle:" + sideC);
	}

}
