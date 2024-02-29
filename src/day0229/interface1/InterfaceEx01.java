package day0229.interface1;

public class InterfaceEx01 {
/*
 		default 메서드 허용이유 
 			- 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위함
 			- 기존 인터페이스 이름과 추상메서드의 변경없이
 				디폴트 메서드의 추가만으로
 				이미 구현된 객체 -> 수정없이 그대로 사용가능
 				새로 구현 할 객체들 -> 추가된 기능 활용가능
 */
	public static void main(String[] args) {
		MyInterface m1 = new MyClassA();
		m1.method1();	//구현 완료한 메서드 호출
		m1.method2();	//오버라이딩 안함, 받은 그대로 실행
		
		MyInterface m2 = new MyClassB();
		m2.method1();
		m2.method2();
	}

}
