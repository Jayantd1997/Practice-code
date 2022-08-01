public class Feku implements Cloneable {
	String name;
	int age;
	
	public Feku(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Feku f = new Feku("Vikas", 31);
		System.out.println(f.name+" "+f.age);
		
		Feku f2 = f;
//		Feku f2 = (Feku) f.clone();
		System.out.println(f2.name+" "+f2.age);
		
	}
}