package exceptions;

public class EmpDatabase {

	private String[] empDb = { "Shantanu", "Karan", "John", "Murali", "Nikitha" };

	public String findEmpByName(String name) throws EmpNotFoundException {
		String emp = null;
		for (int i = 0; i < empDb.length; i++) {
			if (empDb[i].equalsIgnoreCase(name)) {
				System.out.println("Emp Found");
				emp = empDb[i];
			} else {
				continue;
			}

		}
		//try {
			if (emp != null) {
				return emp;
			} else {
				
				throw new EmpNotFoundException("Emp Not Found");
			}
//		} catch (EmpNotFoundException e) {
//			throw e;
//		}
			//System.out.println("finder ends here");
	}
}
