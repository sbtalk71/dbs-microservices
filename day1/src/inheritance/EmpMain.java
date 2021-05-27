package inheritance;

import java.lang.reflect.Method;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee e=new Employee(100, "Shantanu", 56000);
		
		System.out.println(e.getDetails());
		
		TraineeEmp tEmp=new TraineeEmp(102, "Kamal", 78000, "Excellent");
		System.out.println(tEmp.getDetails());
		
		System.out.println(e);
		
		
		Method[] methods=e.getClass().getMethods();
		for(int i=0;i<methods.length;i++) {
			System.out.println(methods[i].getName());
		}
		System.out.println(methods.length);

	}

}
