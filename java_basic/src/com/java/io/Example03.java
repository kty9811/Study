package com.java.io;

import java.io.File;
import java.io.FileWriter;

public class Example03 {
	public static void main(String[] args) {
		try {
			File file=new File("example03.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileWriter myWriter=new FileWriter(file);
			
			myWriter.write("hello\n");
			myWrite.write("java programming");
			myWrite.close();
			
			System.out.println("\n파일쓰기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
