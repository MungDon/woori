package day0304.api;
/*
 		Object 클래스
 			- 자바의 최고 조상 클래스
 			- extends 키워드로 다른 클래스를 상속하지 않고 있다면 
 				java.lang.Object 클래스를 상속 하고 있다.
 			- 변수 없이 메서드만 가지고있다.
 			- 이 메서드는 모든 클래스가 상속 받기 때문에 사용이 가능하다 .
 			
 		.equals()
 			- 두 인스턴스의 주소값을 비교하여 true / false 로 결과을 리턴
 				: 물리적 동일성(인스턴스의 메모리 주소가 같음)
 			- 서로 다른 주소 값을 가지지만 같은 인스턴스라고 정의할 때
 				: 논리적 동일성(논리적으로 두 인스턴스가 같음)
 				: 객체가 저장하고 있는 데이터의 값이 동일한 경우
 			
 		기준 객체.equals(비교객체)
 		
 */
public class ObjectEx01 {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {	// 매개값이 Member 타입이고 id 변수 값이 동일하기 때문에 true 리턴
			System.out.println("obj1과 obj2가 동일합니다");
		}else {
			System.out.println("obj1과 obj2이 동일하지 않습니다");
		}
		if(obj1.equals(obj3)) {// 매개값이 Member 타입으로 같으나  id 변수 값이 다르기 때문에 false 리턴
			System.out.println("obj1과 obj3가 동일합니다");
		}else {
			System.out.println("obj1과 obj3이 동일하지 않습니다");
		}
		
	}
}
