package com.java.dto;

import java.util.Scanner;

public class Circle {

	public static double pie=Math.PI;
	public static int radius;
	public static int area;
	
	public static void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("반지름의 길이를 입력하시오: ");
	radius=scann.nextInt();
	
	}
	public static double cal() {
		area=(int)(radius*radius*pie);
		return area;
	}
	public static void result() {
		System.out.println("원의 넓이는"+area+"입니다.");
	}
}
