package java_basic;

import java.util.Scanner;

public class SosuCheck {

	public static void main(String[] args) {
		
		int inputNumber=0;
		String result="";
		
		Scanner scann=new Scanner(System.in);
		System.out.println("���� �Է�: ");
		inputNumber=scann.nextInt();
		
		for(int i=2; i<inputNumber; i++) {
			if(inputNumber%i==0) {
				result="�ڼ��� �ƴմϴ�.";
				break;
			}else {
				result="�ڼ��Դϴ�.";
			}
		}
		System.out.println(result);
	}
}
