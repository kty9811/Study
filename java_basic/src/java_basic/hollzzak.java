package java_basic;

import java.util.Scanner;

public class hollzzak {

	public static void main(String[] args) {
		
		int input;
		
		Scanner scann=new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하시오");
		
		input=scann.nextInt();
		
		if(input%2==1) {
		System.out.printf("입력한 정수 %d는 홀수입니다.\n",input);
		}
		
		if(input%2==0) {
		System.out.printf("입력한 정수 %d는 짝수입니다.",input);
		}
	}
}
//홀수 짝수 구하기