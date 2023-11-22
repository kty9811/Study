package java_basic;

import java.util.Scanner;

public class RockSisserPaper {

	public static void main(String[] args) {
		
		String com_kwb=""; //가위 0 바위 1 보 2
		int com_kwb_num=0;
		String my_kwb=""; //가위0 바위1 보2
		int my_kwb_num=0;
		int menu=0;
		String juge="";
		
		///입력
		com_kwb_num=(int)(Math.random()*3);
		System.out.println("컴퓨터는 결정했습니다. ");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		Scanner scann=new Scanner(System.in);
		menu=scann.nextInt();
		my_kwb_num=menu-1;
		
		///처리
		if((com_kwb_num)==((my_kwb_num+1)%3)) { //졋다
			juge="졌습니다.";
		}else {
			if(com_kwb_num==my_kwb_num) { //비겻다
				juge="비겼습니다.";
			}else { //이겻다
				juge="이겼습니다.";
			}
		}
		
		if(my_kwb_num==0) {
			my_kwb="가위";
		} else if(my_kwb_num==1) {
			my_kwb="바위";
		} else {
			my_kwb="보";
		}
		
		if(com_kwb_num==0) {
			com_kwb="가위";
		}else if(com_kwb_num==1) {
			com_kwb="바위";
		}else {
			com_kwb="보";
		}
		
		///출력
		System.out.println("컴퓨터 : "+com_kwb);
		System.out.println("당신: "+my_kwb);
		System.out.println(juge);
	}
}//가위바위보 프로그램 정답
