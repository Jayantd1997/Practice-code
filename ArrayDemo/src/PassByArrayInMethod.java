
public class PassByArrayInMethod {
	public void printNames(String names[]) {
		System.out.println("Length of names = " + names.length);
		for (String name : names) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// create a method in current class: printNames()
		// pass an array of names
		// print length of array and their names
		String names[] = { "JAYANT", "VIKAS", "PUNAM" };
		PassByArrayInMethod pbam = new PassByArrayInMethod();
		pbam.printNames(names);

	}

}
