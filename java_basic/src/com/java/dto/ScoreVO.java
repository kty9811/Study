package com.java.dto;

public class ScoreVO {

	public String name;
	public int kor;
	public int math;
	public int eng;
	public int scien;
	
	public int total() {
		return kor+math+eng+scien;
	}
	
	public float evg() {
		return ((int)(total()/4f*100+0.5))/100;
	}
}
