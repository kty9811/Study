package com.java.area;

import java.util.Scanner;

public class Circle {

	double pie=Math.PI;
	int redius;
	int area;
	
	int circle() {
		Scanner scann=new Scanner(System.in);
		System.out.println("�������� ���̸� �Է��Ͻÿ�: ");
		redius=scann.nextInt();
		area=redius*redius*pie;
		return area;
		}
}
