package java_basic;

import java.util.Scanner;

public class SosuCheck {

	public static void main(String[] args) {
		
		int inputNumber=0;
		String result="";
		
		Scanner scann=new Scanner(System.in);
		System.out.println("정수 입력: ");
		inputNumber=scann.nextInt();
		
		for(int i=2; i<inputNumber; i++) {
			if(inputNumber%i==0) {
				result="솟수가 아닙니다.";
				break;
			}else {
				result="솟수입니다.";
			}
		}
		System.out.println(result);
	}
}
