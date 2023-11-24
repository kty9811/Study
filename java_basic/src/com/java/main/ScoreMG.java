//2차원 배열 학생 과목 성적 입력하기
package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {

		final int STUDEN_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("학생 수: ");
		STUDEN_NUM = scann.nextInt();
		scann.nextLine();

		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];

		for (int i = 0; i < STUDEN_NUM; i++) {
			scores[i] = new ScoreVO();
			System.out.print("이름 : ");
			scores[i].name = scann.nextLine();
			
			System.out.print("국어 : ");
			scores[i].kor = scann.nextInt();scann.nextLine();
			
			System.out.print("영어 : ");
			scores[i].eng = scann.nextInt();scann.nextLine();
			
			System.out.print("수학 : ");
			scores[i].math = scann.nextInt();scann.nextLine();
			
			System.out.print("과학 : ");
			scores[i].scien = scann.nextInt();scann.nextLine();
		}
		System.out.println("순번\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
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
