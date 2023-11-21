package java_basic;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int inputInt=scann.nextInt();
		
		System.out.print("실수를 입력하세요: ");
		float inputFloat=scann.nextFloat();
		
		System.out.println("입력한 정수: "+inputInt);
		System.out.println("입력한 실수: "+inputFloat);
	}
}
//숫자 입력하기	