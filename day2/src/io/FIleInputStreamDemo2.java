package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleInputStreamDemo2 {

	public static void main(String[] args) {

		try (
				FileInputStream fis = new FileInputStream(new File("c:\\tmp\\sample.txt"));
				FileOutputStream fos = new FileOutputStream("c:\\tmp\\sample1.txt", true);

		) {

			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
