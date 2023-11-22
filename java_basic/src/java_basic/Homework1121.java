package java_basic;
import java.util.Scanner;

public class Homework1121{
	public static void main(String[] args) {
		
		int user=0;
		String result="";//경기 결과 출력(이김, 비김, 짐)
		String userwhat="";//사용자가 무엇을 냈는지 
		String computerwhat="";//컴퓨터가 무엇을 냈는지 
		
		double random=Math.random();
		int computer=(int)(random*3+1);
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("컴퓨터는 결정했습니다. \n당신의 선택은?\n1.가위 2.바위 3.보 ");
		System.out.print("선택: ");
		user=scan.nextInt();
		
		if(user==computer) {result="\n비겼습니다 ";}
		
		if(user==1) {
			if(computer==2){result="\n졌습니다 "; computerwhat="바위";}
			if(computer==3){result="\n이겻습니다 "; computerwhat="보";}
			userwhat="가위";
		}
		
		if(user==2) {
			if(computer==1) {result="\n이겻습니다 "; computerwhat="가위";}
			if(computer==3){result="\n졋습니다 ";  computerwhat="보";}
			userwhat="바위";
		}
		
		if(user==3) {
			if(computer==1) {result="\n졌습니다 ";}
			if(computer==2) {result="\n이겼습니다 "; computerwhat="바위";}
			userwhat="보";
		}
		System.out.println("컴퓨터: "+computerwhat+"\n당신: "+userwhat+result);
	}
}