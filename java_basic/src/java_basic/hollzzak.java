package java_basic;

import java.util.Scanner;

public class hollzzak {

	public static void main(String[] args) {
		
		int input;
		char juge=' ';
		
		Scanner scann=new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��Ͻÿ�");
		
		input=scann.nextInt();
		
		if(input%2>0) {
		juge='Ȧ';
		}else {
		juge='¦';
		}
		
		System.out.printf("�Է��� ����: "+input+"�� "+juge+"���Դϴ�.\n");
	}
}
//Ȧ�� ¦�� ���ϱ�