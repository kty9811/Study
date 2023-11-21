package java_basic;

public class RandomInt {

	public static void main(String[] args) {
		double random=Math.random();
		int target=(int)(random*3+1);
		System.out.println(target);
	}
}
//1~10까지 랜덤 출력