package day0229.interface3;

public class PClass implements PInterface{

	@Override
	//X인터페이스에서 상속받은 메서드
	public void x() {
		System.out.println("x() 실행");
	}

	@Override
	//y 인터페이스에서 상속받은 메서드
	public void y() {
		System.out.println("y() 실행");
	}

	@Override
	//PInterface 에서 구현 할 메서드
	public void pMethod() {
		System.out.println("pMethod()실행");
	}

}
