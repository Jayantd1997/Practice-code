class Animal {
	void print() {
		System.out.println("This is animal ");
	}
}

class Dog extends Animal {
	void print() {
		System.out.println("This is dog");
	}
}

class Cat extends Animal {
	void print() {
		System.out.println("This is cat");
	}
}

class Lion extends Animal {
	void print() {
		System.out.println("This is lion ");
	}
}

public class Main extends Animal {

	static void method(Animal a) {
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.print();
		}else if(a instanceof Cat){
			Cat c = (Cat) a;
			c.print();	
		}else if(a instanceof Lion) {
			Lion l = (Lion) a;
			l.print();
		}
	}

	public static void main(String[] args) {
		Animal animal = new Dog();
		Main.method(animal);
	}

}
