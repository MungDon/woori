package day0208;

public class OperEx12 {
	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? true일때의 값 또는 조건식 : false일때의 값 또는 조건식;
		// 조건식 - 결과가 논리형으로 나오도록 구성

		System.out.println( (10>0) ? 100 : -100 );
		System.out.println( 10<0 ? 'A' : "F" );
		System.out.println( 10>0 ? 10+10 : 10-10 );

		int a = 10;
		System.out.println( a<0 ? "크다" : 'a' );
		
		String result = a>0 ? "크다" : "작다";
		System.out.println(result);

		int age = 85;
		String result2 = (!( age>90 )) ? "가" : "나" ;
		System.out.println(result2);

		int score = 85;
		char grade = score>90 ? 'A' : score>80 ? 'B' : 'C';
		System.out.println(grade);
		
		int b = 10;
		String value = b>0 ? "양수" : b==0 ? "0이다" : "음수";
		System.out.println(value);

		int c = a>5 ? a>10 ? 500 : 100 : 0 ;
//				a>5 ? 의 결과가 F일때 0
//				a>5 ? 의 결과가 T일때 [a>10 ? 500 : 100] 들어와서 진행
		System.out.println(c);
	}
}