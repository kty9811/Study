package java_basic;

import java.util.Scanner;

public class RockSisserPaper {

	public static void main(String[] args) {
		
		String com_kwb=""; //���� 0 ���� 1 �� 2
		int com_kwb_num=0;
		String my_kwb=""; //����0 ����1 ��2
		int my_kwb_num=0;
		int menu=0;
		String juge="";
		
		///�Է�
		com_kwb_num=(int)(Math.random()*3);
		System.out.println("��ǻ�ʹ� �����߽��ϴ�. ");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		Scanner scann=new Scanner(System.in);
		menu=scann.nextInt();
		my_kwb_num=menu-1;
		
		///ó��
		if((com_kwb_num)==((my_kwb_num+1)%3)) { //����
			juge="�����ϴ�.";
		}else {
			if(com_kwb_num==my_kwb_num) { //����
				juge="�����ϴ�.";
			}else { //�̰��
				juge="�̰���ϴ�.";
			}
		}
		
		if(my_kwb_num==0) {
			my_kwb="����";
		} else if(my_kwb_num==1) {
			my_kwb="����";
		} else {
			my_kwb="��";
		}
		
		if(com_kwb_num==0) {
			com_kwb="����";
		}else if(com_kwb_num==1) {
			com_kwb="����";
		}else {
			com_kwb="��";
		}
		
		///���
		System.out.println("��ǻ�� : "+com_kwb);
		System.out.println("���: "+my_kwb);
		System.out.println(juge);
	}
}//���������� ���α׷� ����
