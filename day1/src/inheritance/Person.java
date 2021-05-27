package inheritance;

public class Person {
	protected int id;
	protected String name;
	
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("Person created...");
	}

	public String getDetails() {
		return id + " " + name;
	}
}
