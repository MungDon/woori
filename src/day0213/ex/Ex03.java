package day0213.ex;

public class Ex03 {
	public static void main(String[] args) {
		// 비트 연산자
		// 비트값을 기반으로 하는 연산자
		// 비트단위로 연산 이루어짐
		// 비트 논리 연산자 ( & , | , ^ , ~ )
		// & (and연산자)
		// - 두개의 비트값이 모두 1인 경우에만 연산의 결과 값이 1
		// 5 & 10
		int num1 = 5;
		int num2 = 10;
		int result1 = num1 & num2;
		System.out.println(result1);


		// | (or연산자)
		// - 비트 값이 하나라도 1이면 결과 값이 1
		int num3 = 5;
		int num4 = 10;
		int result2 = num3 | num4;
		System.out.println(result2);
		
		// 5 & 7
		int num5 = 5;
		int num6 = 7;
		int result3 = num5 & num6;
		System.out.println(result3);
		
		// 10 | 7
		int num7 = 10;
		int num8 = 7;
		int result4 = num7 | num8;
		System.out.println(result4);
	}
}