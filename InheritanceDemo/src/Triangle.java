class Perform {
	double square(double base, double height) {
		return (base * height);
	}
}

public class Triangle {
	double base;
	double height;
	Perform perform;

	double area() {
		perform = new Perform();
		return (perform.square(base, height) / 2);
	}

	public Triangle(int base, int height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle aot = new Triangle(4, 3);
		System.out.println("area of triangle:" + aot.area());
	}

}

/**
 * class -- Calculator
 * 			|-Addition
 * 				|-perform = a+b
 * 			|-Subtraction
 * 				|-perform = a-b
 * 			|-Multiplication
 * 				|-perform = a*b
 * 			|-Division
 * 				|-perform = a/b
 * --main()
 * addition.perform(2,5) => 7
 * */
