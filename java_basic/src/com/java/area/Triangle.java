package com.java.area;

import java.util.Scanner;

public class Triangle {

	public int bottom;
	public int height;
	public int area;
	
	public void input() {
	Scanner scann=new Scanner(System.in);
	System.out.println("�غ��� ���̸� �Է��Ͻÿ�: ");
	bottom=scann.nextInt();
	System.out.println("���̸� �Է��Ͻÿ�: ");
	height=scann.nextInt();
	
	}
	public int cal() {
		area=bottom*height;
		return area;
	}
	public void result() {
		System.out.println("�ﰢ���� ���̴�"+area+"�Դϴ�.");
	}
}
