package com.java.area;

import java.util.Scanner;

public class AreaMain {
	public static void main(String[] args) {
		
		String input="";
		
		Scanner scann=new Scanner(System.in);
		
		while(!input.toUpperCase().equals("Q")) {
			
			System.out.println("\n������ ���� ������ �����Ͻÿ�");
			System.out.println("1.�ﰢ�� 2.�簢�� 3.�� (���α׷� ����: Q)");	
			input=scann.nextLine();
		
		switch(input) {
		
		case "1": 
			Triangle.input();
			Triangle.cal();
			Triangle.result();
			break;
			
		case "2": 
			Rectangle.input();
			Rectangle.cal();
			Rectangle.result();
			break;
			
		case "3": 
			Circle.input();
			Circle.cal();
			Circle.result();
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
