package day0304.exception;

class Animal1 {

}

class Dog1 extends Animal1 {

}

class Cat1 extends Animal1 {

}

public class ExceptionEx04_2 {
	public static void main(String[] args) {
		Animal1 animal1 = null;
		
		animal1 = new Dog1();
		animal1 = new Cat1();
		
		if(animal1 instanceof Dog1) {
			Dog1 dog1 = (Dog1)animal1;
			System.out.println("dog 변환 성공");
		}else if(animal1 instanceof Cat1){
			Cat1 cat1 = (Cat1)animal1;
			System.out.println("Cat 변환성공");
		}else {
			System.out.println("형 변환 실패");
		}
	}
}
