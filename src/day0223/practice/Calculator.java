package day0223.practice;

/*Computer 클래스의 조상*/
public class Calculator {

	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}

}

// 좀 더 정밀한 계산을 하기 위해 Math.PI 상수를 이용.
// 자바 표준 API
// Math 클래스는 수학 계산과 관련된 변수와 메서드를 가지고 있는 클래스
