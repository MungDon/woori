package day0229.noname;

abstract class No{
	public abstract void add();
}

class No2 extends No{

	@Override
	public void add() {
		System.out.println("오버라이딩");
	}
}

public class NoNameEx02 {

	public static void main(String[] args) {
		No no = new No2();		// 다형성 : 조상의 타입 변수에 자손의 객체가 대입 가능하다.
		no.add();
		
		System.out.println();
		
		No no1 = new No() {

			@Override
			public void add() {
				System.out.println("익.명.");
			}
		};
		no1.add();
	}

}
