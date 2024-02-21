package day0221;
/*
  		setChannel(int channel) - 채널 입력 받음
											(조건 - )
		channelUP						- 채널 1업

		channelDown					- 채널 1다운
		
		view								- tv정보
*/

public class Tv {
	// 인스턴스 변수
	public final String BRAND; // 브랜드 |->final 이라 변경이 불가능하기 때문에
	public final int SIZE; // 사이즈 |-> public 을 사용하였다
	private int channel; // 채널 0~10
	private boolean power; // 전원 T-on/F-off

	// 생성자
	Tv() {
		this("LG", 80);
	}

	Tv(String BRAND, int SIZE) {
		this.BRAND = BRAND;
		this.SIZE = SIZE;
		channel = 0;
		power = false;
	}

	// 메서드
	// 리턴타입 메서드 이름(){}
	public void PowerRev() { // 전원 on/off기능
		power = !power;
		if (power == true) {
			System.out.println("전원이 켜졌습니다");
		} else {
			System.out.println("전원이 꺼졌습니다");
		}
	}

	public void setChannel(int channel) { // 채널값 setter
		if (channel >= 0 && channel <= 10) {
			this.channel = channel;
		} else {
			System.out.println("없는 채널입니다.");
		}
	}

	public int getChannel() { // 채널 getter
		return channel;
	}

	public void channelUP() { // 채널 1업
		channel++;
		if (channel > 10) {
			channel = 0;
		}
	}

	public void channelDown() { // 채널 1다운
		if (channel == 0) {
			channel = 10;
		} else {
			channel--;
		}
	}

	public void view() { // tv 정보
		System.out.println("BRAND : " + BRAND);
		System.out.println("SIZE : " + SIZE);
		System.out.println("channel : " + channel);
		System.out.println("power : " + power);
	}
}
