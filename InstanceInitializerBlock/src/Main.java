class Jayant {
	Jayant() {
		System.out.println("Jayant called");
	}

	static {
		System.out.println("Jayant Initializer block");
	}
}

class Super extends Jayant {
	Super() {
		System.out.println("super constructor called");
	}

	static {
		System.out.println("Super Initializer block");
	}
}

public class Main extends Super {
	static {
		System.out.println("Vikas Initializer block");
	}

	Main() {
		System.out.println("constructor called");
	}

	{
		System.out.println("Initializer block");
	}

	public static void main(String[] args) {
		new Main();

	}

}
