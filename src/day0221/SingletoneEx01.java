package day0221;
/*
 		싱글톤 패턴
 			- 인스턴스를 단 하나만 생성하는 디자인 패턴
 			- 프레임워크 부분에서 다시 사용 해볼것
 */

class School{
	private School(){}	// 컴파일러가 추가하는 기본생성자 public,
								// 외부클래스에서 객체 생성을 막기위해 private 로 설정
	
	private static School instanse = new School();
								//우리가 사용 할 인스턴스는 한개 필요
								// 클래스 내부에서 하나의 인스턴스 생성
	
	public static School  getInstane() {
		if(instanse == null) {
			instanse = new School();
		}
		return instanse;	// 유일하게 생성된 인스턴스(객체)
	}
		
} 

public class SingletoneEx01 {
	public static void main(String[] args) {
		// static 이기때문에 클래스 이름으로 호출
		// 참조변수로 받는다
		School s1 = School.getInstane(); //School 에있는 getInstanse메서드 호출
		School s2 = School.getInstane(); //School 에있는 getInstanse메서드 호출
		System.out.println(s2);//	|
		System.out.println(s1);//	|-> 생성된객체는 private static School instanse = new School();이거 하나이기 때문에
													// 주소는 같다
	}
}
