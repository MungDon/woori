package day0227;

/*
 		메서드의 선언부
 			- 리턴 타입 메서드명(매개변수)
 			- 어떤 기능을 하는 메서드인지 알 수 있음
 				: 메서드가 할 일을 명시해 두는것.
 				
 		구현된 메서드 	:	하위 클래스에서 공통으로 사용하는 메서드
 		추상 메서드 		:	하위 클래스가 어떤 클래스냐에 따라 구현 코드 달라짐.
 */
public class Main01 {

	public static void main(String[] args) {
		Computer computer1 = new DeskTop();
		Computer computer2 = new MyNoteBook();
//		Computer computer3 = new NoteBook(); // 추상클래스이기때문에 직접 객체생성 X
//		Computer computer4 = new Computer(); // 추상클래스이기때문에 직접 객체생성 X
		computer1.turnOn();
		computer1.displaying();
		computer1.typing();
		computer1.turnOff();

		System.out.println();

		computer2.turnOn();
		computer2.displaying();
		computer2.typing();
		computer2.turnOff();
	}
}
