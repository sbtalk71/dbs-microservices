package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		
		//List<String> nameList=new ArrayList<>();
		List<String> nameList=new LinkedList<>();
		
		nameList.add("Shantanu");
		nameList.add("Pavan");
		nameList.add("Chandra");
		nameList.add("Ranga");
		nameList.add("Raja");
		nameList.add("Pretham");
		
		System.out.println(nameList);
		
		System.out.println(nameList.isEmpty());
		System.out.println(nameList.size());
		System.out.println(nameList.remove("Raja"));
		System.out.println(nameList);
		
		nameList.add("Shantanu");
		
		nameList.add(2, "John");
		
		System.out.println(nameList.contains("Pretham"));
		
		nameList.remove(4);
		
		System.out.println(nameList);
		
		Iterator<String> nameItr=nameList.iterator();
		while(nameItr.hasNext()) {
			String name=nameItr.next();
			System.out.println("Welcome "+name);
		}
		
		
		
		for(String name:nameList) {
			System.out.println(name);
		}
		
		ListIterator<String> listItr=nameList.listIterator();
		
		while(listItr.hasNext()) {
			String name=listItr.next();
			System.out.println("Good Day "+name);
		}
		
		while(listItr.hasPrevious()) {
			String name=listItr.previous();
			System.out.println("Good Day "+name);
		}
	}

}


