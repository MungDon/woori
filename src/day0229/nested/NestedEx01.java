package day0229.nested;
/*
 		중첩 클래스
 			- 클래스 내부에 선언한 클래스.
 			- 보통은 클래스 - 클래스 관계를 맺을 때 각각 독립적으로 선언하여 사용.
 			- 특정 클래스하고만 관계를 맺을 때
 				클래스 내부에 선언하는것이 좋다.
 		
 		기본형태
 			Class ClassName{
 				class NestedClass{
 				}
 			}
 			
 			- 중첩 인터페이스 
 			Class ClassName{
 				interface NestedInterface{
 				
 				}
 			}
 			
 			- 선언된 위치에 따라 두가지로 분류됨.
 				* 멤버클래스
 					- 인스턴스 멤버 클래스
 						: 객체를 생성해야지 사용 가능한 중첩 클래스
 					- 정적 멤버 클래스
 						: 객체 생성없이 접근 가능한 중첩클래스
 					- 지역클래스
 						: 지역변수처럼 메서드안에 위치함
 */			

class A{
	class b{}			// 인스턴스 클래스		- 사용 : 객체 생성 후 
	static class C{}	// 정적 클래스			- 사용 : 클래스명.클래스명
	void add() {
		class D{}		// 지역 클래스			- 사용 : 해당 지역 내에서만 
	}
}
public class NestedEx01 {

}
