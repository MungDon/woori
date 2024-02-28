package day0228;

public interface RemoteControl {
	// 상수 변수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 디폴트 메서드
	// 실행 내용 까지 작성(구현부 완성)
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다");
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	
	// 정적 메서드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}

}
