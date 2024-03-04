package day0304.exception;
/*
 		ClassCastException
 			* 타입변환
 					: 상위 클래스 - 하위클래스 / 인터페이스 - 구현클래스 발생
 						- 이러한 관계가 아니라면 클래스는 다른 클래스로 타입 변환 불가능
 						- 억지로 타입변환을 시도할 때 발생하는 예외
 */

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class ExceptionEx04 {

	public static void main(String[] args) {
		Animal animal = new Dog();

		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
//		Animal animal = new Dog();   상속 , 구현 관계 전제
		if (animal instanceof Dog) {// 여기 해당 if 문이 없다면 ClassCastException 발생할 수 있음
			Dog dog = (Dog) animal;
			System.out.println("성공");
		}

	}
}
