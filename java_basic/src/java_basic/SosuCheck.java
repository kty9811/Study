package java_basic;

import java.util.Scanner;

public class SosuCheck {

	public static void main(String[] args) {
		
		int inputNumber=0;
		String result="";
		boolean isSotsu=true;
		
		Scanner scann=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		inputNumber=scann.nextInt();
		
		for(int i=2; i<inputNumber; i++) {
			if(inputNumber%i==0) {
				isSotsu=false;
				break;
			}else {
				isSotsu=true;
			}
		}
		
		if(isSotsu) {
			System.out.println("�ڼ��Դϴ�.");
		}else
		System.out.println("�ڼ��� �ƴմϴ�.");
	}
}
