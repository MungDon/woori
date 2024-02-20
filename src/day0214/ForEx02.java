package day0214;

public class ForEx02 {
	public static void main(String[] args) {
/*
		for(①초기식; ②조건식; ④증감식) { 
			③실행문;
		}
*/		
		// 1~100까지 출력
		// 반복 할 수, 출력문
		int a;
		for( a=1; a<101; a++ ){
			System.out.println(a);
		}

		// 홀수
		for(int b=2; b<101; b+=2 ){
			System.out.println(b);
		}

		// 짝수
	}
}