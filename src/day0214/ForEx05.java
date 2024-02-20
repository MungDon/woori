package day0214;

public class ForEx05 {
	public static void main(String[] args) {
		// 구구단
		// 몇 단 dan , 곱 할 수 num
		int dan,num;
		for(dan=2; dan<10; dan++){
			for(num=1; num<=9; num++){ 
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
			System.out.println();
		}
	}
}