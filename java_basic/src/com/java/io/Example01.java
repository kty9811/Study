package com.java.io;
import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {
		File filePath=new File("c:\\temp\\java\\file");
		File fileObj=new File("c:\\temp\\java\\file","example1.txt");
		try {
			filePath.mkdirs();
			boolean success=fileObj.createNewFile();
			if(success) {
				System.out.println("颇老 积己 己傍");
			}else {
				System.out.println("颇老 积己 角菩");
			}
			
			System.out.println(fileObj.getPath());
			System.out.println(fileObj.getName());
			System.out.println(fileObj.getAbsolutePath());
			System.out.println(fileObj.canRead());
			System.out.println(fileObj.canWrite());
			System.out.println(fileObj.length());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
