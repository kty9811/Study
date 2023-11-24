package com.java.area;

import java.util.Scanner;

public class Circle {

	double pie=Math.PI;
	int redius;
	int area;
	
	int circle() {
		Scanner scann=new Scanner(System.in);
		System.out.println("반지름의 길이를 입력하시오: ");
		redius=scann.nextInt();
		area=redius*redius*pie;
		return area;
		}
}
