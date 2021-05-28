package exceptions;

public class EmpNotFoundException extends Exception {

	public EmpNotFoundException() {

	}

	public EmpNotFoundException(String message) {
			super(message);
	}
	
	@Override
	public String toString() {
		
		return this.getClass().getName()+" : "+"Emp Not Found";
	}

}
