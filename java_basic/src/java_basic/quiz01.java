package java_basic;
import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
	
		Scanner scann=new Scanner(System.in);
		
		float inputNumber=0;
		int one=0;
		int two=0;
		int three=0;
		int fore=0;
		
		System.out.print("4자리 정수를 입력하세요: ");
		
		inputNumber=scann.nextFloat();
		
		float tempNum=(inputNumber/10000f);
		
		tempNum=tempNum*10;
		one=(int)tempNum;
		tempNum=tempNum-one;
		
		tempNum=tempNum*10;
		two=(int)tempNum;
		tempNum=tempNum-two;
		
		tempNum=tempNum*10;
		three=(int)tempNum;
		tempNum=tempNum-three;
		
		tempNum=tempNum*10;
		fore=(int)(tempNum+0.5);
		tempNum=tempNum-fore;
	
	System.out.println("4번째 숫자:"+one);
	System.out.println("3번째 숫자:"+two);
	System.out.println("2번째 숫자:"+three);
	System.out.println("1번째 숫자:"+fore);
	}
}