package day0223;
/*
 		Phone 의 자손클래스
  */
public class TvPhone extends Phone {
	// 변수
	int channel;

	// 생성자
	TvPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// 메서드
	public void turnOn() {
		System.out.println("채널 " + channel + "번 시청을 시작합니다");
	}

	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	public void turnOff() {
		System.out.println("Tv 시청을 멈춥니다");
	}
}