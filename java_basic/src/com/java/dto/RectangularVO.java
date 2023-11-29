package com.java.dto;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class RectangularVO extends Shape
                                   implements Inputable, Outputable{
	public int garo;
	public int sero;
	
	public RectangularVO() {}
	
	public RectangularVO(int garo, int sero) {
		super();
		this.garo=garo;
		this.sero=sero;
	}
	
	@Override
	public int surface() {
		return garo*sero;
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	@Override
	public void input() {
		Scanner scann=new Scanner(System.in);
		System.out.print("����: ");
		this.garo=scann.nextInt();
		scann.nextLine();
		System.out.print("����: ");
		this.sero=scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String output() {
		
		return "�簢�� ����";
	}
	
}
