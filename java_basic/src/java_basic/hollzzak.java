package java_basic;

import java.util.Scanner;

public class hollzzak {

	public static void main(String[] args) {
		
		int input;
		
		Scanner scann=new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��Ͻÿ�");
		
		input=scann.nextInt();
		
		if(input%2==1) {
		System.out.printf("�Է��� ���� %d�� Ȧ���Դϴ�.\n",input);
		}
		
		if(input%2==0) {
		System.out.printf("�Է��� ���� %d�� ¦���Դϴ�.",input);
		}
	}
}
//Ȧ�� ¦�� ���ϱ�