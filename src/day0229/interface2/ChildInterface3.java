package day0229.interface2;

public interface ChildInterface3 extends ParentInterface{
	
	//parent 의 디폴트메서드를 추상 메서드로 재선언
	@Override
	public void method2();

	//Child3 자신의 추상 메서드
	public void method3();

}
