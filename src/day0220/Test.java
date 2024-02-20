package day0220;

public class Test {
	// 클래스 변수 (인스턴스 변수)
	int x, y;

	// 생성자
	// 매개변수의 타입, 개수, 순서가 다른것 -> 생성자 오버로딩
	Test() {// 기본생성자
		x = 100;
	}

	Test(int x) {
		this.x = x;
	}

	Test(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메서드
	void printX() {
		System.out.println("x = "+x);
	}
	
	void printY() {
		System.out.println("y = "+y);
	}
	
	void printXY() {
		System.out.println("x = "+x+", y ="+ y);
	}
	
	int returnX() {
		return x;
	}
}
