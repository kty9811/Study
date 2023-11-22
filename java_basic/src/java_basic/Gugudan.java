package java_basic;

public class Gugudan {

	public static void main(String[] args) {
		//입력
		int x=2;
		String result="";
		//처리
		for(int i=1; i<10; i++) {
			result = result+(x+"*"+i+"="+(x*i)+"\n");
		}
		//출력
		System.out.println(result);
	}
}
///////구구단//////
