package day0208;

public class OperEx06 {
	public static void main(String[] args) {
		// 증감연산자의 위치 순서
		// 변수 앞 (선증감) - 1순위
		// 변수 뒤 (후증감)	- 마지막순위
		int a = 10;
		System.out.println(a++);	// 출 연 10, 11
		System.out.println(++a);	// 연 출 12, 12
		System.out.println(a++);	// 출 연 12, 13
		System.out.println(a++);	// 출 연 13, 14
		System.out.println(++a);	// 연 출 15, 15
							a++;	// 연 16
		System.out.println(++a);	// 연 출 17, 17
		System.out.println(a);		// 17

		// -- 감소도 마찬가지
		int b = 10;
		System.out.println(b--);	// 출 연 10 9
		System.out.println(--b);	// 연 출 8  8
		System.out.println(b--);	// 출 연 8  7
		System.out.println(b--);	// 출 연 7  6
		System.out.println(--b);	// 연 출 5  5
							b--;	// 연   4
		System.out.println(--b);	// 연 출 3  3
		System.out.println(b);		// 3
	}
}