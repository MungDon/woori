package day0208;

public class OperEx07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// 더하기 증가 출력
		System.out.println(++a + b);	// 11 + 10 = 21

		int c = 10;
		int d = 10;
		// 증감 , 덧셈, 출력
		System.out.println(++c + ++d);	// 11 + 11 = 22 

		int e = 10;
		int f = 10;
		// 덧셈이 먼저
		System.out.println(e++ + f++);	// 10 + 10 = 20

		int g = 10;
		// 증감 덧셈 출력
		System.out.println(++g + ++g);	// 11 + 12
		
		int h = 10;
		System.out.println(h++ + h++);	// 10 + 11
		// h변수 메모리에는 연산자가 사용되어도 하나밖에 저장 할 수 없다
		// 선행부분의 증감 연산 실행
	}
}