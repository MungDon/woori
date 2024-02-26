package day0226.abstracts;
// 추상클래스
public abstract class Phone {
	// 변수
	public String user;

	// 생성자
	public Phone(String user) {
		this.user = user;
	}

	// 메서드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
