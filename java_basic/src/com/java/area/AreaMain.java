package com.java.area;

import java.util.Scanner;

public class AreaMain {
	public static void main(String[] args) {
		
		String input="";
		
		Scanner scann=new Scanner(System.in);
		
		while(!input.toUpperCase().equals("Q")) {
			
			System.out.println("\n면적을 구할 도형을 선택하시오");
			System.out.println("1.삼각형 2.사각형 3.원 (프로그램 종료: Q)");	
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
			System.out.println("프로그램을 종료합니다.\n ");
			break;
			

			
		default:
			System.out.println("메뉴를 다시 선택해주세요.\n");
			break;
		}
	  }
	}
}
