package day0223.protected_2;

import day0223.protected_1.A;		// 다른 패키지이기 때문에 import 필수!
// 상속관계에서는 가능
public class D extends A{
											// A 클래스 기본생성자가 public 이면 상속받았기 때문에 객체 생성가능 
//A a = new A(); 					// A클래스 기본생성자 protected 라서 사용불가
	// 생성자
	public D() {			
		super();							// 따라서 생성자 호출 방식으로 사용
		this.var = "value";			// 상속 받았기에 this.로 필드변수 나타냄
		this.method();					// 같은이유로 this.메서드 호출가능
	}
}
