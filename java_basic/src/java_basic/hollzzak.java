package java_basic;

import java.util.Scanner;

public class hollzzak {

	public static void main(String[] args) {
		
		int input;
		char juge=' ';
		
		Scanner scann=new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하시오");
		
		input=scann.nextInt();
		
		if(input%2>0) {
		juge='홀';
		}else {
		juge='짝';
		}
		
		System.out.printf("입력한 숫자: "+input+"은 "+juge+"수입니다.\n");
	}
}
//홀수 짝수 구하기