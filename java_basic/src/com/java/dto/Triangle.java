package com.java.dto;

import java.util.Scanner;

public class Triangle {

	public static int bottom;
	public static int height;
	public static float area;
	
	public static void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("�غ��� ���̸� �Է��Ͻÿ�: ");
	bottom=scann.nextInt();
	System.out.println("���̸� �Է��Ͻÿ�: ");
	height=scann.nextInt();
	
	}
	public static float cal() {
		area=bottom*height*0.5f;
		return area;
	}
	public static void result() {
		System.out.println("�ﰢ���� ���̴�"+area+"�Դϴ�.");
	}
}
