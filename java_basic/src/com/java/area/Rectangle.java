package com.java.area;

import java.util.Scanner;

public class Rectangle {

	public static int bottom;
	public static int height;
	public static int area;
	
	public static void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("�غ��� ���̸� �Է��Ͻÿ�: ");
	bottom=scann.nextInt();
	System.out.println("���̸� �Է��Ͻÿ�: ");
	height=scann.nextInt();
	
	}
	public static int cal() {
		area=bottom*height;
		return area;
	}
	public static void result() {
		System.out.println("�簢���� ���̴�"+area+"�Դϴ�.");
	}
}
