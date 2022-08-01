package mypack;

import pack.A;

public class B extends A {

	public static void main(String[] args) throws Throwable {
		B a = new B();

		Thread t = new Thread("JayanT-Thread") {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
//		t.setDaemon(true);
		t.start();
		Thread.sleep(3000);
		a.msg();
		a.finalize();

	}

}
