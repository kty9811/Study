package com.java.dto;

import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO>{

	private String name;
	private int kor;
	private int math;
	private int eng;
	private int scien;
	
	
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	public int getScien() {
		return scien;
	}

	public int total() {
		return kor+math+eng+scien;
	}
	
	public float evg() {
		return ((int)(total()/4f*100+0.5))/100;
	}
	public void input() {
		
		Scanner scann=new Scanner(System.in);
	
		System.out.print("�̸� : ");
		name = scann.nextLine();
		
		System.out.print("���� : ");
		kor = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		eng = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		math = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		scien = scann.nextInt();scann.nextLine();
	}
	public static void printLabel() {
		System.out.println("�̸�\t\t����\t����\t����\t����\t����\t���");
	}
	public void printScore() {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien+"\t"+total()+"\t"+evg());
	}

	@Override
	public int compareTo(ScoreVO other) {
		
		return this.name.compareTo(other.getName());
	}
}
