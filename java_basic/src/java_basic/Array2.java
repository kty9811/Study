package java_basic;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		String[] label = {"����","�̸�", "����", "����", "����", "����", "����", "���" };

		Scanner scann=new Scanner(System.in);
		
		final int STUDENT_NUM; 
		
		System.out.print("�л���: ");
		STUDENT_NUM=scann.nextInt(); scann.nextLine();
		
		String[] name=new String[STUDENT_NUM];
		
		int[] kor =new int[STUDENT_NUM];
		int[] eng = new int[STUDENT_NUM];
		int[] math = new int[STUDENT_NUM];
		int[] scien = new int[STUDENT_NUM];
		int[] total =new int[STUDENT_NUM];
		float[] evg =new float[STUDENT_NUM];
		
		//�Է�
		
		for(int i=0; i<STUDENT_NUM; i++) {
			System.out.println("�л� "+(i+1)+" ���� �Է�");
			System.out.print("�̸�: ");
			name[i]=scann.nextLine();
			System.out.print("����: ");
			kor[i]=scann.nextInt(); scann.nextLine();
			System.out.print("����: ");
			eng[i]=scann.nextInt(); scann.nextLine();
			System.out.print("����: ");
			math[i]=scann.nextInt(); scann.nextLine();
			System.out.print("����: ");
			scien[i]=scann.nextInt(); scann.nextLine();
		}
		
		for(int stuNum=0; stuNum<STUDENT_NUM; stuNum++) {
			total[stuNum]=kor[stuNum]+eng[stuNum]+math[stuNum]+scien[stuNum];
			evg[stuNum]=(int)((total[stuNum]/4f)*100+0.5)/100f;
		}			//����, ��� ���

		System.out.println("�����Է��� ���ƽ��ϴ�.");
		for(int i=0; i<label.length; i++) {
		System.out.print(label[i] + "\t");
		}
		
		System.out.println();
		for(int stuNum=0; stuNum<STUDENT_NUM; stuNum++) {
			System.out.println(stuNum+'\t' + name[stuNum]+"\t"+kor[stuNum]+"\t"+eng[stuNum]+"\t"+math[stuNum]+"\t"+scien[stuNum]+"\t"+total[stuNum]+"\t"+evg[stuNum]+"\t");
			}
	}
}