package com.java.dto;

import java.util.Scanner;

public class Triangle {

	public static int bottom;
	public static int height;
	public static float area;
	
	public static void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("밑변의 길이를 입력하시오: ");
	bottom=scann.nextInt();
	System.out.println("높이를 입력하시오: ");
	height=scann.nextInt();
	
	}
	public static float cal() {
		area=bottom*height*0.5f;
		return area;
	}
	public static void result() {
		System.out.println("삼각형의 넓이는"+area+"입니다.");
	}
}
