package exceptions;

public class EmpSearchApp {

	public static void main(String[] args) {
		EmpDatabase db = new EmpDatabase();
		try {
			System.out.println(db.findEmpByName("Shantanuu"));

		} catch (Exception e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("All ends well here..");
	}

}
