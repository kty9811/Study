package java_basic;

import java.util.Scanner;

public class Operation3 {

	public static void main(String[] args) {

		Scanner scann=new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		int sci=0;
		int sum=0;
		float avg=0;
		char grade='F';
		
		System.out.print("���������� �Է��ϼ���: ");
		kor=scann.nextInt();
		
		System.out.print("���������� �Է��ϼ���: ");
		eng=scann.nextInt();
		
		System.out.print("���������� �Է��ϼ���: ");
		math=scann.nextInt();
		
		System.out.print("���������� �Է��ϼ���: ");
		sci=scann.nextInt();
		
		sum=kor+eng+math+sci;
		
		avg=(float)sum/4;
		avg=(int)((avg*100+5)/10)/10f;
		
		if(avg<60) {grade='F';}
		if(avg>=60) {grade='D';}
		if(avg>=70) {grade='C';}
		if(avg>=80) {grade='B';}
		if(avg>=90) {grade='A';}
		
		
		System.out.println("����\t����\t����\t����\t����\t���\t\t���");
		
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor,eng,math,sci,sum,avg,grade);
	}
}
//���� ��� ����, �ݿø�