//2���� �迭 �л� ���� ���� �Է��ϱ�
package java_basic;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		final int STUDENT_NUM;
		final int SUBJECT_NUM;
		String[] name;
		String[] subject;
		int[][] score;
		int[] total;
		float[] evg;
		
		Scanner scann=new Scanner(System.in);
		
		System.out.print("�л� ��: ");
		STUDENT_NUM=scann.nextInt(); scann.nextLine();
		
		System.out.print("���� ��: ");
		SUBJECT_NUM=scann.nextInt(); scann.nextLine();
		
		name=new String[STUDENT_NUM];
		subject=new String[SUBJECT_NUM];
		score=new int[STUDENT_NUM][SUBJECT_NUM];
		total=new int[STUDENT_NUM];
		evg=new float[STUDENT_NUM];
		
		//������Է�
		for(int i=0; i<SUBJECT_NUM;i++) {
			System.out.println((i+1)+"/"+SUBJECT_NUM+" ��° ����� : ");
			subject[i]=scann.nextLine(); //����� �Է�
		}
		
				//�̸� ���� �Է�
		for(int i=0; i<STUDENT_NUM; i++) {
			System.out.println((i+1)+"/"+STUDENT_NUM+"��° �л� �����Է�");
			System.out.print("�̸� : ");
			name[i]=scann.nextLine(); //�̸� �Է�
			
			for(int j=0; j<SUBJECT_NUM; j++) {
				System.out.print(subject[j]+"  :  ");
				score[i][j]=scann.nextInt(); scann.nextLine();  //���� �Է�
			}
		}
		//ó��
		for(int i=0; i<STUDENT_NUM; i++) {
			for(int j=0; j<SUBJECT_NUM; j++) {
				total[i]=total[i]+score[i][j];
			}
			evg[i]=(int)(total[i]/(float)SUBJECT_NUM*100+0.5f)/100f;
		}
		//���
		//��
		System.out.print("����:\t�̸�\t\t");
		for(int i=0; i<SUBJECT_NUM; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.print("����\t���");
		System.out.println();
		//�л�����
		for(int i=0; i<STUDENT_NUM; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for(int j=0; j<SUBJECT_NUM; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(total[i]+"\t"+evg[i]+"\n");
		}
		System.out.println();
	}
}
