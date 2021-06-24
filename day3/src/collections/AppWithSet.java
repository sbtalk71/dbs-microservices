package collections;

import java.util.HashSet;
import java.util.Set;

import collections.entity.Emp;

public class AppWithSet {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(100, "Shantanu", "Hyderabad", 80000));
		empSet.add(new Emp(101, "John", "Hyderabad", 60000));
		empSet.add(new Emp(102, "Mary", "Hyderabad", 50000));
		empSet.add(new Emp(103, "Amith", "Hyderabad", 40000));
		empSet.add(new Emp(104, "Pulkit", "Hyderabad", 40000));
		empSet.add(new Emp(105, "Tirumala", "Hyderabad", 30000));
		empSet.add(new Emp(106, "Girish", "Hyderabad", 90000));
		
		System.out.println(empSet);
	}
}
