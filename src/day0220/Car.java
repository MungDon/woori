package day0220;

/*
 		인스턴스 멤버
 				- 객체를 생성해야만 사용가능.
 		 - 인스턴스 변수
 		 - 인스턴스 메서드
 */
public class Car {
	// 클래스 변수 (인스턴스 변수)
	int gas;

	// 메서드
	void setGas(int gas) { // 가스값 주입
		this.gas = gas;
	}

	boolean isGas() {	// 가스 유무 검사
		if (gas == 0) {
			System.out.println("가스가 없습니다");
			return false;
		} else {
			System.out.println("가스가 있습니다");
			return true;
		}
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("자동차가 달립니다" + " 가스량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("자동차가 멈춥니다" + " 가스량 : " + gas);
				return;
			}
		}
	} // 리턴 타입이 없는 void 에서의 return 문 = 메서드의 종료

//	int getGas() {
//		return gas;
//	}
}
