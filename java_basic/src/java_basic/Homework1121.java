package java_basic;
import java.util.Scanner;

public class Homework1121{
	public static void main(String[] args) {
		
		int user=0;
		String result="";//��� ��� ���(�̱�, ���, ��)
		String userwhat="";//����ڰ� ������ �´��� 
		String computerwhat="";//��ǻ�Ͱ� ������ �´��� 
		
		double random=Math.random();
		int computer=(int)(random*3+1);
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("��ǻ�ʹ� �����߽��ϴ�. \n����� ������?\n1.���� 2.���� 3.�� ");
		System.out.print("����: ");
		user=scan.nextInt();
		
		if(user==computer) {result="\n�����ϴ� ";}
		
		if(user==1) {
			if(computer==2){result="\n�����ϴ� "; computerwhat="����";}
			if(computer==3){result="\n�̰���ϴ� "; computerwhat="��";}
			userwhat="����";
		}
		
		if(user==2) {
			if(computer==1) {result="\n�̰���ϴ� "; computerwhat="����";}
			if(computer==3){result="\n�����ϴ� ";  computerwhat="��";}
			userwhat="����";
		}
		
		if(user==3) {
			if(computer==1) {result="\n�����ϴ� ";}
			if(computer==2) {result="\n�̰���ϴ� "; computerwhat="����";}
			userwhat="��";
		}
		System.out.println("��ǻ��: "+computerwhat+"\n���: "+userwhat+result);
	}
}