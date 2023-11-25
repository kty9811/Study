package com.java.area;

import java.util.Scanner;

public class Rectangle {

	public static int bottom;
	public static int height;
	public static int area;
	
	public static void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("밑변의 길이를 입력하시오: ");
	bottom=scann.nextInt();
	System.out.println("높이를 입력하시오: ");
	height=scann.nextInt();
	
	}
	public static int cal() {
		area=bottom*height;
		return area;
	}
	public static void result() {
		System.out.println("사각형의 넓이는"+area+"입니다.");
	}
}
