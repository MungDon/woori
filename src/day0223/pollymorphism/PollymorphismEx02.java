package day0223.pollymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 움직입니다");
	}
	public void speak() {
		System.out.println("사람이 말을 합니다");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 움직입니다");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥합니다");
	}
}

class Cat extends Animal {
	@Override
	public void move() {
		System.out.println("고양이가 움직입니다");
	}
	public void cute() {
		System.out.println("고양이가 귀엽습니다");
	}
}

public class PollymorphismEx02 {
	public static void main(String[] args) {
		PollymorphismEx02 p = new PollymorphismEx02();	
		p.animalMove(new Tiger()); 					// 상속한 자손객체를 매개변수로 넣어서 오버라이드 된걸 확인 Animal animal = new Tiger();와 같음
//		Human h = new Human();
//		Animal a1 = h;
//		a1.move();
//		Tiger t = new Tiger();
//		Cat c = new Cat();
	}
	public void animalMove(Animal animal) {	// Animal 타입의 매개변수를 받아 public void move(){};를 호출하는 메서드 
		animal.move();
	}
}
