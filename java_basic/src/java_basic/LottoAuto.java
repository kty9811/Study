package java_basic;

import java.util.Scanner;

public class LottoAuto {

	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		
		int inputMoney=0;	//����ݾ�
		int outputMoney=0;//�ܵ�
		int count=0;//�ζ� ����
		int [] lottoNumber=new int[6]; //�ζ� ��ȣ 6�� ���
		
		//�Է�
		System.out.print("�ݾ��� �Է��ϼ���: ");
		inputMoney=scann.nextInt();
		
		count=inputMoney/1000;	//�ζ� ����
		outputMoney=inputMoney%1000;	//�ܵ� ��ȯ
		
		
		
	for(int j=0; j<count; j++) {
			for(int i=0; i<6; i++) {
				lottoNumber[i] = (int)(Math.random() * 45+1);
				System.out.print(lottoNumber[i]+"\t");
		}
		System.out.println();
		}
		System.out.println("�ܵ���"+outputMoney+"�Դϴ�.");

	}

}
