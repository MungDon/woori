package day0226.pollymorphism;

public class Car {
	// 변수 : 4개의 타이어
	// Tire 생성자에서 타이어의 위치, 최대회천수를 매개값으로 받는중
	Tire frontLeft = new Tire("앞 왼쪽", 6);
	Tire frontRight = new Tire("앞 오른쪽", 2);
	Tire backLeft = new Tire("뒤 왼쪽", 3);
	Tire bakcRight = new Tire("앞 오른쪽", 4);

	// 생성자

	// 메서드
	public int run() { //roll() : 타이어 1회전 시키는 메서드
		// 펑크 - >  stop();호출
		// 해당 타이어의 번호(위치 구별)가 리턴
		System.out.println("[자동차가 달립니다]");
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (bakcRight.roll() == false) {
			stop();
			return 4;
		} 
		return 0;

	}

	public void stop() { // 타이어 펑크 났을때
		System.out.println("[자동차가 멈춥니다]");
	}
}
