package com.java.io;

import java.io.File;
import java.io.FileWriter;

public class Gugudan {

	public static void main(String[] args) {
		int dan=2;
		int gop=9;
		String resultStr="";
		
		for(dan=2; dan<10; dan++) {
			resultStr+=dan+"��\n";
			for(gop=1;gop<10;gop++) {
				resultStr+=dan+" * "+gop+" = "+(dan*gop)+"\n";
			}
			resultStr+="\n";
		}
		
		try {
			File file=new File("gugudan.txt");
			
			if(!file.exists())
				file.createNewFile();
			
			FileWriter myWriter=new FileWriter(file);
			
			myWriter.write(resultStr);
			myWriter.close();
			
			System.out.println("\n���Ͼ��� ����");
		}catch(Exception e) {
			System.out.println(e);
	}
	}
}
