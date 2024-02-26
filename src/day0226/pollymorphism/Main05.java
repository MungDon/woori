package day0226.pollymorphism;
/*
  			instanceof 연산자
  			 - 어떤객체가 어떤 클래스의 인스턴스인지 확인할때 사용.
  			 - instanceof 기준으로 왼쪽에 객체 , 오른쪽에 타입이 온다
  			 - 왼쪽의 객체가 오른쪽의 타입으로 생성되었다 - > ture / 아니면 -> false
  			 - 매개값의 타입 조사할때 주로 사용.
  			 
  			 - 메서드 내에서 강제 타입 변환이 필요한 경우 
  			 	매개값이 어떤 객체인지 instanceof 연산자로 확인 한 후 
  			 	안전하게 강제 타입 변환을 해야한다
  			 
  			 - ClassCateException발생
 */

public class Main05 {
	
	public static void method1(Parent3 parent3) {
		if(parent3 instanceof Child3) {
			Child3 child3 = (Child3)parent3;
			System.out.println("method1 - Child3 변환 성공");
		}else {
			System.out.println("method1 - Child3 변환 실패");
		}
	}
	public static void method2(Parent3 parent3) {
		Child3 child3 = (Child3)parent3;
		System.out.println("method2- Chlid3 변환성공");
	}
	
	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		method1(parentA);
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		method1(parentB);
		method2(parentB);		// 예외 발생
		// 무조건 변환 하려고 했기 때문
	}
	
}
