//2차원 배열 학생 과목 성적 입력하기
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
		
		System.out.print("학생 수: ");
		STUDENT_NUM=scann.nextInt(); scann.nextLine();
		
		System.out.print("과목 수: ");
		SUBJECT_NUM=scann.nextInt(); scann.nextLine();
		
		name=new String[STUDENT_NUM];
		subject=new String[SUBJECT_NUM];
		score=new int[STUDENT_NUM][SUBJECT_NUM];
		total=new int[STUDENT_NUM];
		evg=new float[STUDENT_NUM];
		
		//과목명입력
		for(int i=0; i<SUBJECT_NUM;i++) {
			System.out.println((i+1)+"/"+SUBJECT_NUM+" 번째 과목명 : ");
			subject[i]=scann.nextLine(); //과목명 입력
		}
		
				//이름 점수 입력
		for(int i=0; i<STUDENT_NUM; i++) {
			System.out.println((i+1)+"/"+STUDENT_NUM+"번째 학생 정보입력");
			System.out.print("이름 : ");
			name[i]=scann.nextLine(); //이름 입력
			
			for(int j=0; j<SUBJECT_NUM; j++) {
				System.out.print(subject[j]+"  :  ");
				score[i][j]=scann.nextInt(); scann.nextLine();  //점수 입력
			}
		}
		//처리
		for(int i=0; i<STUDENT_NUM; i++) {
			for(int j=0; j<SUBJECT_NUM; j++) {
				total[i]=total[i]+score[i][j];
			}
			evg[i]=(int)(total[i]/(float)SUBJECT_NUM*100+0.5f)/100f;
		}
		//출력
		//라벨
		System.out.print("순번:\t이름\t\t");
		for(int i=0; i<SUBJECT_NUM; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.print("총점\t평균");
		System.out.println();
		//학생정보
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
