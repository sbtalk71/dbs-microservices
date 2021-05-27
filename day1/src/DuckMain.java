
public class DuckMain {

	public static void main(String[] args) throws Exception{
		Class.forName("Duck");
		
		/*Duck d1 = new Duck();
		Duck d2 = new Duck();
		Duck d3 = new Duck();
		Duck d4 = new Duck();
		Duck d5 = new Duck();*/

		System.out.println("No of ducks = " + Duck.duckCount);
		Duck.f1();
		//Duck.f2();

	}

}
