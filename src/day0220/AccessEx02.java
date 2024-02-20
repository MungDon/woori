package day0220;

class ATest{
	public 	static int a = 100;		// 모든 접근 허용
	private 	static int b = 200;		// 같은 클래스만 가능
	public 	static int c = b;			// 모든 접근 허용
	
	private ATest(){	}
}


public class AccessEx02 {

	public static void main(String[] args) {
//		ATest t = new ATest(); 				// (private),	다른클래스라 안됨
		
		System.out.println(ATest.a);
//		System.out.println(ATest.b);		// (private),	다른클래스라 안됨
		System.out.println(ATest.c);

	}

}
