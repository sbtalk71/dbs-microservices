package collections.map;

import java.util.HashMap;
import java.util.Map;

import collections.entity.Emp;

public class MapEmpApp {

	public static void main(String[] args) {
		Map<Integer, Emp> empMap = new HashMap<>();

		empMap.put(100, new Emp(100, "Shantanu", "Hyderabad", 80000));
		empMap.put(101, new Emp(101, "John", "Hyderabad", 60000));
		empMap.put(102, new Emp(102, "Mary", "Hyderabad", 50000));
		empMap.put(103, new Emp(103, "Amith", "Hyderabad", 40000));
		empMap.put(104, new Emp(104, "Pulkit", "Hyderabad", 40000));
		empMap.put(105, new Emp(105, "Tirumala", "Hyderabad", 30000));
		empMap.put(106, new Emp(106, "Girish", "Hyderabad", 90000));

		int id=100;

		boolean found=false;
		
			if (empMap.containsKey(id)) {
				found=true;
				Emp emp = empMap.get(id);
				System.out.println(emp);
			}

		if(!found) {
			System.out.println("Employee Not Found..");
		}
	}

}
