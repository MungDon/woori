package day0226.abstracts;

public abstract class Animal {
	//변수
	public String kind;
	
	//메서드 
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	//추상 메서드 - {} 구현부가 없다
	public abstract void sound();
}
