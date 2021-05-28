package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("c:\\");
		
		System.out.println("its directory: "+file.isDirectory());
		System.out.println("Is its writable : "+file.canWrite());
		
		String[] filesList=file.list();
		for(String f:filesList) {
			System.out.println(f);
		}
		
		

	}

}
