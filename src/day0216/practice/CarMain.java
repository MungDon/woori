package day0216.practice;

public class CarMain {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스 이름 = new 클래스();
		Car c1 = new Car();
		
		//변수 사용
		System.out.println(c1.maxSpeed);
		System.out.println(c1.run);
		System.out.println(c1.model);
		
		// 변수 값 대입 :  변수이름 = 값;
		c1.maxSpeed = 250;	
		System.out.println(c1.maxSpeed);
		c1.color = "red";
		System.out.println(c1.color);
		
	}

}
/*
 		클래스 변수(멤버변수)에 초기값을 주지않고 선언만 했을 때
 				-> 객체 생성 시 자동으로 기본 값으로 초기화 됨 
 				-> 기본타입 : 정수 = 0, 실수 : 0.0, 논리 : false
 				-> 참조타입 : 클래스(String포함, ~~), 배열, 인터페이스 : 기본값 null
 				
 */
