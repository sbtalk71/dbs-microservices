package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleInputStreamDemo3 {

	public static void main(String[] args) {

		try (
				FileInputStream fis = new FileInputStream(new File("c:\\tmp\\sample.txt"));
				BufferedInputStream bis=new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream("c:\\tmp\\sample1.txt", true);
				BufferedOutputStream bos=new BufferedOutputStream(fos);

		) {

			int b = 0;
			while ((b = bis.read()) != -1) {
				System.out.print((char) b);
				bos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
