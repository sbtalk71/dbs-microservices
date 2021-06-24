package collections.map;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties props=System.getProperties();
		//System.out.println(props);

		Enumeration propEnum=props.keys();
		while(propEnum.hasMoreElements()) {
			String key=(String)propEnum.nextElement();
			System.out.println(key+" --> "+props.getProperty(key));
		}
		
		

	}

}
