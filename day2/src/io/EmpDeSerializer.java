package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDeSerializer {

	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.ser"));) {

			while (true) {
				Emp e = (Emp) ois.readObject();

				System.out.println(e.getId() + " " + e.getName()+e.getAge());

				System.out.println("emp deserialized...");
			}

		} catch (EOFException e) {
				System.out.println("Emp fetch done..");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
