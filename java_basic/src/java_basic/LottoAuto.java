package java_basic;

import java.util.Scanner;

public class LottoAuto {

	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		
		int inputMoney=0;	//결재금액
		int outputMoney=0;//잔돈
		int count=0;//로또 개수
		int [] lottoNumber=new int[6]; //로또 번호 6개 출력
		
		//입력
		System.out.print("금액을 입력하세요: ");
		inputMoney=scann.nextInt();
		
		count=inputMoney/1000;	//로또 개수
		outputMoney=inputMoney%1000;	//잔돈 반환
		
		
		
	for(int j=0; j<count; j++) {
			for(int i=0; i<6; i++) {
				lottoNumber[i] = (int)(Math.random() * 45+1);
				System.out.print(lottoNumber[i]+"\t");
		}
		System.out.println();
		}
		System.out.println("잔돈은"+outputMoney+"입니다.");

	}

}
