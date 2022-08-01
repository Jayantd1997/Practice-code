package pack;

public class A {
	public void msg() {
		System.out.println("Hello");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}

}
