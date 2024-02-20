package day0219.practice;

public class Calculator {
	// 메서드

	int plus(int x, int y) {
		// x+y // 이 기능을 할거다.
		return x + y;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	int subtract(int x, int y) {
		int result = x - y;
		return result;
	}

	int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	//리턴타입이 없는 메서드 
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
