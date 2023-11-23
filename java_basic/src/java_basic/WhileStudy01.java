package java_basic;

import java.util.Scanner;

public class WhileStudy01 {

	public static void main(String[] args) {
		
		String menu="";
		
		Scanner scann=new Scanner(System.in);
		
		while(!menu.toUpperCase().equals("Q")) {
			
		System.out.println("1.회원가입 2.회원조회 3.회원수정 4.회원삭제");
		System.out.println("메뉴를 선택하세요.(종료 : Q)");
		
		menu=scann.nextLine();
		
		switch(menu) {
		
		case "1": 
			System.out.println("회원가입.......\n");
			break;
			
		case "2": 
			System.out.println("회원조회.......\n");
			break;
			
		case "3": 
			System.out.println("회원수정.......\n");
			break;
			
		case "4": 
			System.out.println("회원삭제.......\n");
			break;
			
		case "q": case "Q":
			System.out.println("프로그램을 종료합니다.\n ");
			break;
			
		default:
			System.out.println("메뉴를 다시 선택해주세요.\n");
			break;
		}
	  }
	}
}
