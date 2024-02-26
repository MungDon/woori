package day0226.abstracts;

public class Dog extends Animal{
	//생성자
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public  void sound() {
		System.out.println("강아지는 멍멍");
	}
}
