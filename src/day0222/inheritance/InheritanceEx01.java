package day0222.inheritance;
/*
  	상속
  		- 변수, 메서드를 물려받음 (생성자는 메모리에 올라가지 않아서 못받음)
  		- 조상은 하나의 클래스만 가능 1:1상속(자손 기준)
  		- 자손의 객체를 생성하면 조상의 객체도 생성된다. (상속 받음 = 조상의 주소를 참조)
 */
class A { // 조상
	int x = 10;
}

class B extends A { // A클래스 상속
	int y = 20;
}

class C extends A {		// A클래스 상속
	int z = 30;
}

class D extends B { // B클래스 상속
	int i = 40;
}

public class InheritanceEx01 {
	public static void main(String[] args) {
		B b = new B();	// 상속받은 클래스들의 객체도 생성된다
		D d = new D(); 	// 상속받은 클래스들의 객체도 생성된다
		
		System.out.println("d.i : " + d.i);
		System.out.println("d.y : " + d.y);	
		System.out.println("d.x : " + d.x); 
		System.out.println();
		System.out.println("b.y : " + b.y);
		System.out.println("b.x : " + b.x);
	}
}
