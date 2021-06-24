package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set<String> nameSet=new HashSet<>();
		//SortedSet<String> nameSet=new TreeSet<>(new MySetSorter());
		SortedSet<String> nameSet=new TreeSet<>((s1,s2)->s2.compareTo(s1));
		
		nameSet.add("Shantanu");
		nameSet.add("Pavan");
		nameSet.add("Chandra");
		nameSet.add("Ranga");
		nameSet.add("Raja");
		nameSet.add("Pretham");
		
		System.out.println(nameSet);
		
		System.out.println(nameSet.isEmpty());
		System.out.println(nameSet.size());
		System.out.println(nameSet.remove("Raja"));
		System.out.println(nameSet);
		
		nameSet.add("Shantanu");
		System.out.println(nameSet.contains("Pretham"));
		
		System.out.println(nameSet);
		
		Iterator<String> nameItr=nameSet.iterator();
		while(nameItr.hasNext()) {
			String name=nameItr.next();
			System.out.println("Welcome "+name);
		}
		
		for(String name:nameSet) {
			System.out.println(name);
		}
	}

}

class MySetSorter implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.compareTo(s1);
	}
	
}
