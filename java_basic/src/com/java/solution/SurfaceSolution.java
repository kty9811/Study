package com.java.solution;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;

public class SurfaceSolution {

	private Shape s;
	private int menu;
	
	public void start() {
		do {
			input();
			
			process();
			
			output();
			
			}while(true);
	}
	
	protected void input() {
		Scanner scann=new Scanner(System.in);
		System.out.println("������ �����Ͻÿ� ");
		System.out.println("1. �ﰢ�� 2. �簢��  3. ��");
		menu=scann.nextInt(); scann.nextLine();
		
		switch(menu) {
		case 1:	//�ﰢ��
			s=new TriangleVO();
			break;
			
		case 2:	//�簢��
			s=new RectangularVO();
			break;
			
		case 3:	//��
			s=new CircleVO();
			break;
			
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
		}
		
		s.inputData();
		
	}
	
	protected void process() {
		switch(menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("���α׷��� �����մϴ�. ");
			System.exit(0); //���� ���� (����õ)
		}
	}
	
	protected void output() {
		
		System.out.println(s.outputMessage()+s.surface());
		
		System.out.println("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� ��������. ");
		String menu=new Scanner(System.in).nextLine(); //�͸� �ν��Ͻ�
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
}
