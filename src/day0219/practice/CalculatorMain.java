package day0219.practice;

public class CalculatorMain {

	public static void main(String[] args) {
		// 객체 생성
		Calculator c1 = new Calculator();

		c1.powerOn(); //리턴타입이 없는 메서드 호출
		
		// 덧셈 메소드 호출
		int result = c1.plus(5, 1);
		System.out.println(result);

		// 나눗셈 메소드 호출
		double result2 = c1.divide(10, 5);
		System.out.println(result2);

		byte a = 10;
		byte b = 4;
		double result3 = c1.divide(a, b);
		System.out.println(result3);

		int x = 50;
		byte y = 4;
		double result4 = c1.divide(x, y);
		System.out.println(result4);

		// 뺄셈
		int c = 100;
		int d = 43;
		int result5 = c1.subtract(c, d);
		System.out.println(result5);

		// 곱하기
		int e = 10;
		int f = 2;
		int result6 = c1.multi(e, f);
		System.out.println(result6);

		c1.powerOff(); //리턴타입이 없는 메서드 호출
	
	}

}
