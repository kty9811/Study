package com.java.area;

import java.util.Scanner;

public class AreaMain {
	public static void main(String[] args) {
		
		String input;
		
		Scanner scann=new Scanner(System.in);
		
		
		input=scann.nextLine();
		
		while(!input.toUpperCase().equals("Q")) {
			
			System.out.println("������ ���� ������ �����Ͻÿ�");
			System.out.println("1.�ﰢ�� 2.�簢�� 3.�� (���α׷� ����: Q");
		input=scann.nextLine();
		
		switch(input) {
		
		case "1": 
			
			break;
			
		case "2": 
			
			break;
			
		case "3": 
			
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
