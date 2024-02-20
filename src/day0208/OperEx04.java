package day0208;

public class OperEx04 {
	public static void main(String[] args) {
/*
		나머지 연산자 %
		10 % 2 = 0
		10 % 3 = 1
		10 % 4 = 2
		10 % 7 = 3
		10 % 12 = 10	// 나눌수가 없다. 남는값은 10
*/
		int a = 10;
		System.out.println( a%3 );	// 1
		System.out.println( a%5 );	// 0
		System.out.println( a%15 );	// 10
	}
}