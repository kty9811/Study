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
		str="\"�ȳ��ϼ���.\"\t\n�ݰ����ϴ�.";
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println("����: "+c);
		System.out.println("����: "+(int)c);
		System.out.println(str);

	}

}
