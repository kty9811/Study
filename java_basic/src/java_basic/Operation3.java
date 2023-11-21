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
		
		System.out.print("국어점수를 입력하세요: ");
		kor=scann.nextInt();
		
		System.out.print("영어점수를 입력하세요: ");
		eng=scann.nextInt();
		
		System.out.print("수학점수를 입력하세요: ");
		math=scann.nextInt();
		
		System.out.print("과학점수를 입력하세요: ");
		sci=scann.nextInt();
		
		sum=kor+eng+math+sci;
		
		avg=(float)sum/4;
		avg=(int)((avg*100+5)/10)/10f;
		
		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<성 적 표>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,sum,avg);
	}
}
//과목별 평균 총점, 반올림