package java_basic;

import java.util.Scanner;

public class star02 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
