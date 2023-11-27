package com.java.dto;

public class TriangleVO {

	public int height=0;
	public int baseLine=0;

	public TriangleVO() {
		
	}
	

	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}
	public int surface() {
		return (int)(height*baseLine*0.5f);
	}
}
