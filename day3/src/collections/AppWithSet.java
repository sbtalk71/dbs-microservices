package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
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
		
		//find and print all employees who's salary between 30000-60000
		for(Emp e:empSet) {
			if(e.getSalary()==30000||e.getSalary()<60000) {
				System.out.println(e);
			}
		}
		//find all employees who's name contains 'm'
		for(Emp e:empSet) {
			if(e.getName().contains("m")) {
				System.out.println(e.getName());
			}
		}
		
		//sort the employees based on name in asc order
		
		List<Emp> empList=new ArrayList<>(empSet);
		Collections.sort(empList,new MySetSorter2());
		
		System.out.println(empList);
	}
}

class MySetSorter2 implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}
	
}
