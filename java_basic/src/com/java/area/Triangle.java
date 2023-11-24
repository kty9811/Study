package com.java.area;

import java.util.Scanner;

public class Triangle {

	public int bottom;
	public int height;
	public int area;
	
	public void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("밑변의 길이를 입력하시오: ");
	bottom=scann.nextInt();
	System.out.println("높이를 입력하시오: ");
	height=scann.nextInt();
	
	}
	public int cal() {
		area=bottom*height;
		return area;
	}
	public void result() {
		System.out.println("삼각형의 넓이는"+area+"입니다.");
	}
}
