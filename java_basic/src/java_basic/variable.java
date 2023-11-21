package java_basic;

public class variable {

	public static void main(String[] args) {
	
		byte b;
		int i;
		short s;
		long l;
		char c;
		String str;
		
		b=Byte.MAX_VALUE;
		i=Integer.MAX_VALUE;
		s=Short.MAX_VALUE;
		l=Long.MAX_VALUE;
		c='A';
		str="\"안녕하세요.\"\t\n반갑습니다.";
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println("문자: "+c);
		System.out.println("숫자: "+(int)c);
		System.out.println(str);

	}

}
