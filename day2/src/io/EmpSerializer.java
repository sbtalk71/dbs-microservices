package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerializer {

	public static void main(String[] args) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.ser"));
				ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("empdata.ser",true)) {
					protected void writeStreamHeader() throws IOException {
						reset();
					};
				};) {
			Emp e = new Emp(103, "John", 25);

			Emp e1 = new Emp(104, "Scott", 34);
			Emp e2 = new Emp(105, "Maria", 54);
			oos.writeObject(e);
			
			oos1.writeObject(e1);
			oos1.writeObject(e2);
			System.out.println("emp serialized...");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
