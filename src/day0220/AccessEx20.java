package day0220;
/*
 		접근제어자
 			모든 문법에서 가장 우선 적용된다.
 			- public				: 	모든 접근을 허용
 			- protected		: 	같은 패키지 or 상속관계
 			- default			: 	같은 패키지 	내 -> 앞에 아무것도없는경우 
 			- private			:	본인 클래스 내
 			
 			클래스				: 	public, default 만 사용 가능.
 			변수					:	모두 사용 가능 - 인스턴스, 정적 / 지역변수 사용 불가 
 			생성자 / 메서드	:	모두 사용 가능
 */
public class AccessEx20 {
	public 				static int a;
	protected	 		static int b;
							static int c;
	private				static int d;
}
