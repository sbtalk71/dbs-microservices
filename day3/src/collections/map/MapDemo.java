package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {

		//Map<Integer, String> namesMap = new HashMap<>();
		//Map<Integer, String> namesMap = new LinkedHashMap();
		Map<Integer, String> namesMap = new Hashtable<>();
		
		//Map namesMap = new Properties();
		
		namesMap.put(998899889, "Shantanu");
		namesMap.put(998897789, "Chandra");
		namesMap.put(977899889, "Pavan");
		namesMap.put(998895589, "Arun");
		namesMap.put(995599889, "Nishant");
		namesMap.put(998899769, "John");
		namesMap.put(918899889, "Ruby");

		System.out.println(namesMap.get(998895589));

		Set<Integer> keys = namesMap.keySet();
		for (Integer id : keys) {
			System.out.println(id + ": " + namesMap.get(id));
		}
		
		Collection<String> names=namesMap.values();
		
		for(String name:names) {
			System.out.println(name);
		}
		
		Set<Map.Entry<Integer, String>> entrySet= namesMap.entrySet();
		
		for(Map.Entry entry:entrySet) {
			System.out.println(entry.getKey()+": --> "+entry.getValue());
		}
		//System.out.println(namesMap);

	}
}
