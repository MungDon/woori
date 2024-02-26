package day0226.abstracts;

/*
 		추상 메서드 
 			- 미완성 메서드
 			- 리턴타입 메서드이름(매개변수) //  선언부
 				{ // 구현부
 				}
 			- "선언부"까지만 존재하는 메서드 = 구현부가 존재 하지 않음
 			- abstract 키워드, {실행영역}대신 ; 사용
 			- 상속 받은 자식클래스는 '반드시' 추상클래스를 오버라이딩(재정의) 해야 함
 */
public class AbstractEx02 {

	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		// sound() 호출하는 3가지방법
		// 1. Dog,Cat 객체 생성 후 호출
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();

		System.out.println("==========");

		// 2. 자동 타입변환
		// 부모변수 = 자식의 객체
		Animal animal1 = new Dog(); // 자동 타입 변환
		Animal animal2 = new Cat(); // 오버라이딩 된 메서드
		animal1.sound();
		animal2.sound();

		System.out.println("==========");

		// 3. 매개변수의 자동타입 변환
		animalSound(new Dog()); // 오버라이딩 된 메서드
		animalSound(new Cat()); // 오버라이딩 된 메서드

	}

}
