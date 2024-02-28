package day0228;
/*
			다중 인터페이스 구현 클래스
				- 객체는 다수의 인터페이스 타입으로 사용가능
				- (반드시)모든 인터페이스의 추상 메서드를 구현해야함
				
				public class 구현클래스 implements 인터페이스A, 인터페이스B{
					//인터페이스 A의 추상 메서드 구현
					//인터페이스 B의 추상 메서드 구현
				}
 */
public class InterfaceEx03 {
	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc = st;
		Searchable sc = st;
		
		st.turnOn();
		st.setVolume(5);
		st.search("구글");
		st.setMute(true);
		st.setMute(false);
		st.turnOff();
		
		System.out.println();
		
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(false);
		rc.setMute(true);
		rc.turnOff();
		
		System.out.println();
		
		sc.search("naver");
	}
}
