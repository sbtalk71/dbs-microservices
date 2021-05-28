package exceptions;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			double d = a / b;
			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[3]);
			String[] names = new String[5];

			// names[3].equals("something");

			System.out.println("No Exception here");
		} finally {
			System.out.println("Finally executes..");
		}
		System.out.println("Normal Execution resumed");
	}
}
