package day0223;

/*
 		TvPhone 클래스의 조상 클래스
 */
public class Phone {
	// 변수
	String model;
	String color;

	// 생성자

	// 메서드
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다");
	}

	public void bell() {
		System.out.println("벨이 울립니다");
	}

	public void sendVoice(String msg) {
		System.out.println("본인 : " + msg);
	}
	public void receiveVoice(String msg) {
		System.out.println("상대 : "+msg);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
}
