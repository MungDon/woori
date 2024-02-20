package day0213.ex;

public class Ex05 {
	public static void main(String[] args) {
		// 비트 이동 연산자(시프트 연산자)
		// << , >>
		// << 연산자 : 비트를 왼쪽으로 이동
		int num1 = 5;
		int result1 = num1 << 2;
		System.out.println("num1 << 2 = "+result1);

		// >> 연산자 : 비트를 오른쪽으로 이동
		int num2 = 10;
		int result2 = num2 >> 2;	// 오른쪽으로 두칸 이동
		System.out.println("num2 >> 2 = "+result2);

		// 10 << 3
		//       0 0 0 0 1 0 1 0
		// 0 0 0 0 1 0 1 0 0 0 0
		// 64 + 16 = 80
		System.out.println(10 << 3);
		// 5 >> 1
		//   0 1 0 1 : 이동 후
		// 0 1 0 1 : 원래 5
		//   0 1 0 : 결과 : 2
		System.out.println(5 >> 1);
		
		// 5 >> 2
		System.out.println(5 >> 2);
	}
}