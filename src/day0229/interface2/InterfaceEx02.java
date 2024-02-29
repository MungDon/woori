package day0229.interface2;

/*
		디폴트 메서드 가지고있는 인터페이스 상속
			- 디폴트 메서드 단순히 상속만 받음
			- 디폴트 메서드 오버라이딩(재정의)해서 실행 내용 변경
			- 디폴트 메서드 추상메서드로 재선언
			
 */
public class InterfaceEx02 {
	public static void main(String[] args) {
		ChildInterface1 ch1 = new ChildClass1();
		ch1.method1();	//	parent - method1
		ch1.method2(); 	//	parent 의 디폴트 method2() 호출
		ch1.method3();	//	ChildInterface 1 이 가지고있는 method 
		
		System.out.println("====================");
		
		ChildInterface2 ch2 = new ChildClass2();
		ch2.method1();	//parent - method1
		ch2.method2();	// child2 - method2
		ch2.method3();	//child2 - method3
	
		System.out.println("====================");
	
		ChildInterface3 ch3 = new ChildClass3();
		ch3.method1();	// parent - method1
		ch3.method2();	// child3 이 재선언한 method2 호출
		ch3.method3();	// child3 의 method3 호출
		
	}
}
