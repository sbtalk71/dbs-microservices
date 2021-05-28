package exceptions;

public class C {

	public void f3() {
		try {
			throw new RuntimeException("Something Wrong..");
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println( "I am OK Now");
			throw e;
		}
	}
}
