package com.java.dto;

import java.util.Scanner;

public class Circle {

	public static double pie=Math.PI;
	public static int radius;
	public static int area;
	
	public static void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("�������� ���̸� �Է��Ͻÿ�: ");
	radius=scann.nextInt();
	
	}
	public static double cal() {
		area=(int)(radius*radius*pie);
		return area;
	}
	public static void result() {
		System.out.println("���� ���̴�"+area+"�Դϴ�.");
	}
}
