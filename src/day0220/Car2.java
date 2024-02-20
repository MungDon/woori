package day0220;

// 
public class Car2 {
	// 클래스변수(인스턴스 변수)
	private int speed;
	private boolean stop;

	// 생성자

	// 메서드
	public int getSpeed() { // getter
		return speed;
	}

	public void setSpeed(int speed) { // speed 변수 setter
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() { // 정지여부 확인기능
		return stop;
	}

	public void setStop(boolean stop) { // stop 변수 setter
		this.stop = stop;
	}
}
