package day0228;

/*
 		인터페이스(interface)
 			- 객체의 사용방법을 정의한 타입.
 			- 개발 코드를 수정하지 않고 객체를 변경할 수 있도록 하기 위함
 			- 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐
 				실행 결과 , 리턴 값이 다를 수 있다.
 			
 			인터페이스의 선언
 			public interface 인터페이스 명 {. . . } 
 				- public : 다른 패키지에서도 인터페이스에 접근이 가능
 				- interface 키워드 사용
 				- 인터페이스명 클래스 명명규칙과 같다
 				
 			구성요소
 				- 클래스 : 변수, 생성자 , 메서드 
 				- 인터페이스 : 상수변수, 추상 메서드만 가짐
 						: 8버전부터 default 메서드와 static 메서드 사용가능
 			interface 인터페이스명{
 					// 상수 변수 
 					[public final static] 타입 변수이름 = 값; // 상수선언할때 반드시 값이 있어야함
 					//추상메서드
 					[public abstract] 리턴타입 메서드명(매개변수);
 					
 					- 8버전 이상
 					//default 메서드
 					 [public ]default 리턴타입 메서드명(매개변수){구현부}
 					 //정적메서드
 					 [public] static 리턴타입 메서드명(매개변수){구현부}
 			} 
 			[]표시한것은 인터페이스라서 컴파일시 자동추가됌
 				
 			구현 클래스
 				 - 보통의 클래스와 동일.
 				 - 인터페이스 타입으로 사용할 수 있음을 알려주는 
 				 	implements 키워드 사용 후 인터페이스 명 써준다
 				 - 인터페이스가 가진 추상 메서드들을 반드시 구현해야한다.
 					이때, public 접근제어자 생략안됨
 				 - 구현객체를 인터페이스 변수에 대입해서 사용.
 				 인터페이스 변수;
 				 변수 = 구현객체;
 				 인터페이스 변수  = 구현객체;
 */
public class InterfaceEx01 {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();			//대입
		rc = new Audio();				//가능
		
		//인터페이스 변수 선언
		RemoteControl rc2 = null;
		
		//Tv 객체를 인터페이스에 대입
		rc2 = new Television();
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.setMute(false);
		rc2.setMute(true);
		rc2.turnOff();
		RemoteControl.changeBattery();
		
		System.out.println();
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.setVolume(6);
		rc2.setMute(false);
		rc2.setMute(true);
		rc2.turnOff();
		RemoteControl.changeBattery();
	}
}
