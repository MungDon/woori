package day0213.loop;

public class WhileEx02 {
	public static void main(String[] args) {
		// 1~100까지 출력
		int i = 1;			// 초기식
		while(i <= 100){	// 조건식
			System.out.println(i);	// 실행문
			i++;			// 증감식
		}

		// 홀수 출력
		int a = 1;
		while(a < 101){
			System.out.println(a);
			a+=2; // a=a+2;
		}

		// 짝수 출력
		int b = 2;
		while(b<=100){
			System.out.println(b);
			b+=2;
		}
	}
}