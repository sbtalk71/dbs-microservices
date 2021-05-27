
public class OverloadDemo {

	public void add() {
		System.out.println("add() --> Nothing to add");
	}
	
//	public int add(int a, int b) {
//		System.out.println("add(int, int)  called");
//		return a+b;
//	}
//	public float add(float a, int b) {
//		System.out.println("add(float, int)  called");
//		return a+b;
//	}
	
	public double add(double a, double b) {
		System.out.println("add(double, double)  called");
		return a+b;
	}
	public double add(double a, double b,double c) {
		System.out.println("add(double, double, double)  called");
		return a+b;
	}
}

class Main{
	public static void main(String[] args) {
		OverloadDemo o = new OverloadDemo();
		o.add();
		o.add(2, 3);
		o.add(2.0f, 20);
		o.add(1.0,2.0);
	}
}
