package exceptions;

public class B {

	public void f2() {
		C c = new C();
		try {
		c.f3();
		}catch(RuntimeException e) {
			System.out.println("B is OK Now");
			e.printStackTrace();
			throw e;
		}
	}
}
