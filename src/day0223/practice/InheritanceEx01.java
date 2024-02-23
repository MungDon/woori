package day0223.practice;

/*
  		상속
  		 - 조상 클래스의 private 멤버(변수, 메서드) 상속 불가
  		 - 서로 다른 패키지에 존재한다면 default 멤버(변수, 메서드) 상속 불가
  		 - 조상 클래스의 수정 = > 자손 클래스 '들' 의 수정 - 유지 / 보수 최소화
 */
public class InheritanceEx01 {

	public static void main(String[] args) {
		TvPhone tPhone = new TvPhone("java", "black",10);
		
		// Phone 으로부터 상속을 받은 변수 출력
		System.out.println("model : "+tPhone.model);
		System.out.println("color : "+tPhone.color);
		System.out.println();
		
		// TvPhone 이 가지고있는 본인의 변수
		System.out.println("channel : "+tPhone.channel);
		System.out.println();
		
		// Phone 으로 부터 상속 받은 메서드 호출
		tPhone.powerOn();
		tPhone.bell();
		tPhone.sendVoice("여보세요");
		tPhone.receiveVoice("XXX씨 맞나요?");
		tPhone.sendVoice("아닌데요");	
		tPhone.hangUp();
		tPhone.powerOff();
		System.out.println();
		
		// TvPhone 본인의 메서드
		tPhone.turnOn();
		tPhone.changeChannel(25);
		tPhone.turnOff();
		
	}

}
