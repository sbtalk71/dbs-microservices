package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos=null;

		try {
			fis = new FileInputStream(new File("c:\\tmp\\sample.txt"));
			fos=new FileOutputStream("c:\\tmp\\sample1.txt",true);
			int b = 0;
			while ((b = fis.read()) != -1) {
					System.out.print((char)b);
					fos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
