package com.java.area;

import java.util.Scanner;

public class Rectangle {

	int width;
	int length;
	int area;
	
	int rectangle() {
		Scanner scann=new Scanner(System.in);
		System.out.println("가로의 길이를 입력하시오: ");
		width=scann.nextInt();
		System.out.println("세로의 길이를 입력하시오: ");
		length=scann.nextInt();
		area=width*length;
		return area;
		}
}
