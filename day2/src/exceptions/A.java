package exceptions;

public class A {

	public void f1() {
		B b = new B();
		try {
		b.f2();
		}catch(RuntimeException e) {
			System.out.println("A is OK now");
			e.printStackTrace();
			throw e;
		}
	}
}
