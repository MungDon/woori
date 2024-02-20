package day0208;

public class OperEx09 {
	public static void main(String[] args) {
		// 논리 연산자 (if / for 등의 제어문과 함께 쓰임)
		// && , || , !
		// &&	(and연산자)	: 조건이 모두 true일때 결과 true
		// ||	(or연산자)	: 조건 중 하나라도 true이면 결과 true
		// !	(not연산자)	: 결과를 반대로
		System.out.println(true && true);	// T
		System.out.println(true && false);	// F
		System.out.println(true && false && true);	// F
		System.out.println(false && false);	// F

		System.out.println(true || true);	// T
		System.out.println(true || false);	// T
		System.out.println(true || false || true);	// T
		System.out.println(false || false);	// F

		// 비교연산자와 함께 사용
		int a = 10;
		int b = 5;
		boolean result = (a>0) && (a>1000);	// 비교 , &&
		System.out.println(result);

		boolean result2 = a>0 || a>1000;
		System.out.println(result2);

		System.out.println(!result2);	// 결과 반대
		
		boolean result3 = !result2;
		System.out.println(result3);
	}
}