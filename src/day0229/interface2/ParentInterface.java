package day0229.interface2;

public interface ParentInterface {
	// 추상메서드
	public void method1();
	
	//디폴트 메서드
	public default void method2() {
		System.out.println("parent - default() 실행");
	}
}
