package exceptions;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		try {
			a.f1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Code Works...");

	}

}
