package day0208;

public class OperEx05 {
	public static void main(String[] args) {
		// 증감(증가,감소) 연산자
		// ++ , -- : 1증가 , 1감소
		// boolean 논리형 타입에서 사용 불가
		int a = 10;
		System.out.println(a);	// 10
						  ++a;	// ;(세미콜론)이 붙어있으면 하나의 실행문 
								// 혼자 실행함. 단지 출력을 안했을 뿐
		System.out.println(a);	// 11
						  a++;	// 혼자 실행 12
		System.out.println(a);	// 12

		// 증감연산자의 위치에따른 우선순위
		// 증감연산자가 변수의 뒤에 있을때 연산이 제일 마지막에 일어남
		// 연산, 출력 두가지 일을 한다
		int b = 10;
		System.out.println(++b);	// 선증가(선감소) 연산 11 , 출력 11
		System.out.println(b);		// 출력 11
		System.out.println(b++);	// 후증가(후감소) 출력 11 , 연산 12
		System.out.println(b);
	}
}