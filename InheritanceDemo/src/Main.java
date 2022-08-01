
class Parent {
	public void print() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	public void print() {
		System.out.println("child");
	}
}

public class Main {
	public static void main(String[] args) {
		Object obj = new Child();
		Child c = (Child) obj;
		c.print();
	}
}
