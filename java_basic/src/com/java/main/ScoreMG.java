//2���� �迭 �л� ���� ���� �Է��ϱ�
package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {

		final int STUDEN_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("�л� ��: ");
		STUDEN_NUM = scann.nextInt();
		scann.nextLine();

		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];

		for (int i = 0; i < STUDEN_NUM; i++) {
			scores[i] = new ScoreVO();
			System.out.print("�̸� : ");
			scores[i].name = scann.nextLine();
			
			System.out.print("���� : ");
			scores[i].kor = scann.nextInt();scann.nextLine();
			
			System.out.print("���� : ");
			scores[i].eng = scann.nextInt();scann.nextLine();
			
			System.out.print("���� : ");
			scores[i].math = scann.nextInt();scann.nextLine();
			
			System.out.print("���� : ");
			scores[i].scien = scann.nextInt();scann.nextLine();
		}
		System.out.println("����\t�̸�\t����\t����\t����\t����\t����\t���");
		for(int i=0; i<STUDEN_NUM; i++) {
			System.out.println((i+1)	+"\t"+scores[i].name
											+"\t"+scores[i].kor
											+"\t"+scores[i].eng
											+"\t"+scores[i].math
											+"\t"+scores[i].scien
											+"\t"+scores[i].total()
											+"\t"+scores[i].evg());
											
		}

	}
}
