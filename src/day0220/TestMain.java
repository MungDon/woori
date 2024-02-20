package day0220;

public class TestMain {

	public static void main(String[] args) {
		Test t1 = new Test();						//Test 객체 생성
		System.out.println("t1.x = "+t1.x); 	// x 값 읽기
		
		t1.printX();						// Test 클래스에서 printX 메서드 호출
		t1.printY();							// Test 클래스에서 printY 메서드 호출
		t1.printXY();						// Test 클래스에서 printXY 메서드 호출
		int result = t1.returnX();		// Test 클래스에서 returnX 메서드 호출 하여 result 에 대입
		System.out.println(result);	// 대입한 result 값 출력
	}

}
