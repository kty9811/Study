package com.java.area;

import java.util.Scanner;

public class Rectangle {

	int width;
	int length;
	int area;
	
	int rectangle() {
		Scanner scann=new Scanner(System.in);
		System.out.println("������ ���̸� �Է��Ͻÿ�: ");
		width=scann.nextInt();
		System.out.println("������ ���̸� �Է��Ͻÿ�: ");
		length=scann.nextInt();
		area=width*length;
		return area;
		}
}
