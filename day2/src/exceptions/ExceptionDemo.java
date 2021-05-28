package exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			double d = a / b;
			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[3]);
			String[] names = new String[5];

			// names[3].equals("something");

			System.out.println("No Exception here");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			//System.out.println("oops! Something Wrong!");
			System.out.println(e);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally executes..");
		}
		System.out.println("Normal Execution resumed");
	}
}
