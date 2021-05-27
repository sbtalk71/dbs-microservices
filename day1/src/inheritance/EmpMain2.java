package inheritance;

public class EmpMain2 {

	public static void main(String[] args) {
		
		Person p = new Employee(100, "Shantanu", 67000);
		
		System.out.println(p.getDetails());
		
		
		Person p1=new TraineeEmp(102, "Kiran", 45000, "good");
		System.out.println(p1.getDetails());
		
		Employee e= (Employee)new Person(100, "A");
		System.out.println(e.getDetails());
		
		Object name="Shantanu";

	}

}
