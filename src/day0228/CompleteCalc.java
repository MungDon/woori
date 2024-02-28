package day0228;

public class CompleteCalc extends Calculator {

	@Override
	public int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	@Override
	public int devide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		}
		return Calc.ERROR;
	}
	
	//CompleteCalc 의 메서드
	public void info() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}

}
