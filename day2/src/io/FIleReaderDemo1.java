package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleReaderDemo1 {

	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos=null;

		try {
			fis = new FileReader(new File("c:\\tmp\\sample.txt"));
			fos=new FileWriter("c:\\tmp\\sample2.txt",true);
			int b = 0;
			while ((b = fis.read()) != -1) {
					System.out.print((char)b);
					fos.write(b);
					fos.flush();
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
