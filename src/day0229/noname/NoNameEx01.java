package day0229.noname;

/*
 		익명 구현 객체 
 			- 구현 클래스를 만들어서 객체로 사용(일반적)
 				이 클래스를 재사용 할 수 있기에 편리함
 			- 일회성 구현객체가 필요 할때
 				클래스 만들고 -> 객체 생성 하는것이 비효율적이다
 			- 익명 구현 객체 생성하여 인터페이스 변수에 대입하여 사용
 				이때, 하나의 실행문이므로 끝에는 ;(세미콜론)이 붙어야함
 				
 		인터페이스 변수 = new 인터페이스(){
 			//인터페이스에 선언된 추상 메서드 모두 구현
 			// 추가적으로 만든 변수와 메서드는 익명객체 안에서만 사용가능
 			// 인터페이스 변수로 접근 불가능
 		
 		};
 */
public class NoNameEx01 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("전원이 켜집니다");
			}
			public void turnOff() {
				System.out.println("전원이 꺼집니다");
			}
			public void setVolume(int volume) {
				System.out.println(volume);
			}
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}
}
