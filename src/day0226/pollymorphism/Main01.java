package day0226.pollymorphism;

public class Main01 {
	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = child; // 자동타입 변환
		
		parent.method1();
		parent.method2(); // 오버라이딩 된 메서드 호출 
//		parent.method3();	// 호출 불가능
									// 자식 클래스의 멤버  
		
		
	}
}
