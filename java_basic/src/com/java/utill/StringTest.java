package com.java.utill;

public class StringTest {

	public static void main(String[] args) {
		
		String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		System.out.println(str);
		System.out.println(str.charAt(10));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(10));
		System.out.println(str.substring(0,10));
		System.out.println(str.replace("ABC", "ㄱㄴㄷ")); //바꿔서 출력(값이 바뀌지는 않음)
		System.out.println(str.contains("abc")); //이런글자가 있는지 true false로 출력
		System.out.println(str.indexOf("abc"));//이런글자로 시작되는게 있는지 확인
		System.out.println(str.lastIndexOf("abc"));// "  뒤에서부터 확인
		
		String str2="010-1234-5678";
		String[] strArray=str2.split("-"); //-로 구분하여 배열 나누기
		System.out.println(strArray[1]);
		System.out.println(str2.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$"));
		System.out.println(str.equals(str2));
		System.out.println(str.toUpperCase().equalsIgnoreCase(str)); //대소문자구분없이 비교
		
		
	}

}
