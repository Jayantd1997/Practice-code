
public interface Calculator {

	double perform(double a, double b);
	
	static void print() {
		System.out.println("print method called");
	}
	
	default void clean() {
		System.out.println("cleanup started...");
	}

}
