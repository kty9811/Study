package java_basic;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int inputInt=scann.nextInt();
		
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		float inputFloat=scann.nextFloat();
		
		System.out.println("�Է��� ����: "+inputInt);
		System.out.println("�Է��� �Ǽ�: "+inputFloat);
	}
}
//���� �Է��ϱ�	