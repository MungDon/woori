package day0229.nested;

class AAA{
	int aaa = 10;
	class BBB{								// 인스턴스 클래스
		static final int Z = 500;		// 정적 변수는 상수만 가능 
		int x = 100;
	}
}


public class NestedEx03 {

	public static void main(String[] args) {
		AAA a = new AAA();
		AAA.BBB b = a.new BBB();			// 중첩 인스턴스 크랠스 객체 생성
		System.out.println(b.x);
		System.out.println(AAA.BBB.Z);
	}

}
