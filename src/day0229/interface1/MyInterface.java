package day0229.interface1;

public interface MyInterface {
	//추상메서드
	public void method1();
	
/*기능추가 필요
//	public void method2();
	추상 메서드는 하위 클래스에서 구현이 필수 
	구현을 하지못할경우
	디폴트 메서드 사용
*/
	
	//default method
	public default void method2() {
		System.out.println("MyInterface - method2() 실행");
	}
}
