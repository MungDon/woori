package day0228;

// 계산기 만들기 위한 인터페이스
public interface Calc {
	// 상수변수
	//public final static 생략가능
	double PI = 3.14;				//원주율
	int ERROR = -9999999;		// 에러났을 때 사용할 에러 변수
	
	//추상메서드
	// 사칙연산
	// public abstract 
	int add(int num1, int num2);		// 더하기
	
	int minus(int num1, int num2);	// 빼기
	
	int multi(int num1, int num2); 	//곱하기

	int devide(int num1, int num2); 	//나누기

	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	





}
