package java_basic;

import java.util.Scanner;

public class WhileStudy01 {

	public static void main(String[] args) {
		
		String menu="";
		
		Scanner scann=new Scanner(System.in);
		
		while(!menu.toUpperCase().equals("Q")) {
			
		System.out.println("1.ȸ������ 2.ȸ����ȸ 3.ȸ������ 4.ȸ������");
		System.out.println("�޴��� �����ϼ���.(���� : Q)");
		
		menu=scann.nextLine();
		
		switch(menu) {
		
		case "1": 
			System.out.println("ȸ������.......\n");
			break;
			
		case "2": 
			System.out.println("ȸ����ȸ.......\n");
			break;
			
		case "3": 
			System.out.println("ȸ������.......\n");
			break;
			
		case "4": 
			System.out.println("ȸ������.......\n");
			break;
			
		case "q": case "Q":
			System.out.println("���α׷��� �����մϴ�.\n ");
			break;
			
		default:
			System.out.println("�޴��� �ٽ� �������ּ���.\n");
			break;
		}
	  }
	}
}
