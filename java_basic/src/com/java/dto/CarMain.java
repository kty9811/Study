package com.java.dto;

public class CarMain {

	public static void main(String[] args) {
		
		Car car=new Car();
		System.out.println("��������: "+car.wheel);
		
		car=new FireEngine();
		
		if(car instanceof FireEngine) {
			
			car=new Car();
			
			car.speedUp();
			car.speedDown();
			System.out.println(car.wheel);
			System.out.println("---------------------------");
			
			FireEngine f=new FireEngine();
			car=f;
			
			car.speedUp();
			car.speedDown();
			System.out.println(car.wheel);
		
		}else {
			System.out.println("Ambulance �ν��Ͻ��� �ƴմϴ�.");
		}
		

	}

}
