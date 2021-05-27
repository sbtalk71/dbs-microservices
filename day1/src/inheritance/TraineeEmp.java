package inheritance;

public class TraineeEmp extends Employee {
	protected String performance;

	public TraineeEmp(int id, String name, double salary, String perf) {
		super(id, name, salary);
		this.performance = perf;
	}
	
	@Override
	public String getDetails() {
		
		return super.getDetails()+" "+performance;
	}
	
	
}
