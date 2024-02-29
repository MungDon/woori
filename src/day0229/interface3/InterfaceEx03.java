package day0229.interface3;

/*
 	 	인터페이스의 상속
 	 		- 인터페이스 간에도 상속이 가능하다
 	 		- 구현 코드를 통해 기능을 상속하는 것이 아님
 	 		 	형 상속(type inheritance)이라고 부름
 	 		 - 클래스 상속 1 : 1
 	 		 - 인터페이스는 여러개 동시 상속가능
 	 		 - 상속받는 인터페이스는 상위 인터페이스들의 모든 추상 메서드를 가지게 됨
 	 		 
 */
public class InterfaceEx03 {
	public static void main(String[] args) {
		PClass pClass = new PClass();
		
		// 상위 인터페이스 
		// x 인터페이스에 선언한 메서드만 사용가능
		X x = pClass;
		x.x();
		
		System.out.println("==============");
		
		//Y 에 선언한 메서드만 사용 가능
		Y y = pClass;
		y.y();
		
		System.out.println("==============");
		
		// 구현한 인터페이스 타입의 변수에 대입 
		//인터페이스가 상속한 모든 메서드 호출 가능
		PInterface p = pClass;
		p.x();
		p.y();
		p.pMethod();
	}
}
