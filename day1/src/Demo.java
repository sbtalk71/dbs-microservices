import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("number of arguments passed : "+args.length);
		System.out.println("Hell there...");
		
		System.out.println("Enter Your Name ...");
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		
		System.out.println(name);
		
	}

}
