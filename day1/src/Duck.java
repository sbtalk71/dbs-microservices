
public class Duck {
	static {
		System.out.println("Static Block is executed...");
	}
	
	public static void f1() {
		System.out.println("This is static method f1()");
	}
	
	public void f2() {
		System.out.println("This is static method f2()");
	}
	static int duckCount = 0;

	public Duck() {
		duckCount++;
	}
}
