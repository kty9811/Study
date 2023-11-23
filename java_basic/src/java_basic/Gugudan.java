package java_basic;

public class Gugudan {

	public static void main(String[] args) {
		//입력
		String result="";
		
		for(int x=2; x<10; x++) {
			for(int y=1; y<10;y++) {
				result=result+(x+"*"+y+"="+(x*y)+"\n");
			
			}
	result=result+"\n";
		}
		System.out.println(result);
	}
}
///////구구단//////
