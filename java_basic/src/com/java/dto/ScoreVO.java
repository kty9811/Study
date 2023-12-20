package com.java.dto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO>{

	private String name;
	private String stuNum;
	private int kor;
	private int math;
	private int eng;
	private int scien;
	private Date regDate;
	
	
	public String getStuNum() {
		return stuNum;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
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
		
		System.out.print("�й� : ");
		stuNum = scann.nextLine();
		
		System.out.print("���� : ");
		kor = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		eng = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		math = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		scien = scann.nextInt();scann.nextLine();
		
		regDate=new Date();
	}
	public static void printLabel() {
		System.out.println("�й�\t�̸�\t\t����\t����\t����\t����\t����\t���\t�����");
	}
	public void printScore() {
		
		SimpleDateFormat stdFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		String regDate=stdFormat.format(this.regDate);
		String today=stdFormat.format(new Date());
		
		if(regDate.equals(today)) {
			regDate=new SimpleDateFormat("HH:mm:ss").format(this.regDate);
		}
		
		System.out.println(stuNum+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien
				+"\t"+total()+"\t"+evg()+"\t"+regDate);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ScoreVO) {
			ScoreVO other=(ScoreVO)obj;
			return other.equals(stuNum);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public int compareTo(ScoreVO other) {
		if(this.stuNum.equals(other.stuNum)) {
			return 0;
		}else {
		return other.getRegDate().compareTo(this.regDate);
	}
}
}