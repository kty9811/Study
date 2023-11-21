package java_basic;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
	
		Scanner scann=new Scanner(System.in);
		
		int inputNumber=0;
		
		System.out.print("4자리 정수를 입력하세요: ");
		
		inputNumber=scann.nextInt();
		
		int one=0;
		int two=0;
		int three=0;
		int fore=0;
		
		one=inputNumber/1000;	
		two=(inputNumber-(one*1000))/100;
		three=(inputNumber-((two*100)+(one*1000)))/10;
		fore=inputNumber-((one*1000)+(two*100)+(three*10));
				
		System.out.printf("4번째 숫자: %d\n",one);
		System.out.printf("3번째 숫자: %d\n",two);
		System.out.printf("2번째 숫자: %d\n",three);
		System.out.printf("1번째 숫자: %d\n",fore);
	}
}
