package java_basic;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {

		int x=0;
		Scanner scann=new Scanner(System.in);
		System.out.print("정수 입력: ");
		x=scann.nextInt();
		
		for(int i=0; i<x; i++) {
			System.out.print("*");
		}
	}
}
