package day0226.abstracts;

public class Cat extends Animal{

	//생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	
	//메서드
	//추상 메서드는 반드시 오버라이딩 해야한다.
	@Override
	public void sound() {
		System.out.println("고양이는 야옹.");
	}



}
