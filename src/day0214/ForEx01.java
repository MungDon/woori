package day0214;

public class ForEx01 {
	public static void main(String[] args) {
/*
		for문
		가장 많이 사용하는 반복문. 배열과 주로 사용.
		반복문을	구현하는데 필요한 요소들을 함께 작성.
				한줄에 작성하기 때문에 간결, 가독성이 좋음.
		for( 1.초기식; 2.조건식; 4.증감식 ){
			3.실행문;
		}
		초기식 - for문 시작 할 때 한번만 실행.
		조건식 - 언제까지 반복할 것인지 구현.
		증감식 - 증가/감소 시킴.
		수행 순서가 중요!!
		1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2(false일때까지 반복) 
*/		
		// 1~5까지 반복
		int a;
		for( a=1; a<=5; a++ ){
			System.out.println(a);
		}// for문 끝

		// "hello world" 5번 출력
		int b;
		String c = "hello world";
		for( b=1; b<6; b++ ){
			System.out.println(c);
		}
	}
}