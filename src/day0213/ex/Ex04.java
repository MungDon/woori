package day0213.ex;

public class Ex04 {
	public static void main(String[] args) {
		// ^ (xor연산자)
		// 같으면 0 , 다르면 1
		// 5 ^ 10
		int num1 = 5;
		int num2 = 10;
		int result1 = num1 ^ num2;
		System.out.println(result1);

		// ~ 반전 연산자
		// 0 -> 1 , 1 -> 0 바꾸는 연산자
		int num3 = 10;
		int result2 = ~num3;
		System.out.println("~num3 = "+result2);
		// 0 0 0 0 1 0 1 0
		// 1 1 1 1 0 1 0 1
	}
}