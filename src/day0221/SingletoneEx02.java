package day0221;

class Phone {
// static 붙은것들을 우선으로 적는다 (메모리 할당 순서로 적기)
	private static Phone p = new Phone(); 
	
	public int number = 1234;
	
	public static Phone getInstanse() {
		return p;
	}
	
	private Phone() { }
	
}

public class SingletoneEx02 {
	public static void main(String[] args) {
		Phone p1 = Phone.getInstanse(); //Phone 타입의 인스턴스 가져옴
		Phone p2 = Phone.getInstanse(); //Phone 타입의 인스턴스 가져옴
		
		System.out.println(p1);
		System.out.println(p2);				//p1, p2가 참조한  객체 주소 확인 = > 같음
		
		System.out.println(p1.number);	
		System.out.println(p2.number);	// p1 , p2  안에 number 변수 값 확인
		
		p2.number =20;							// p2 안에 number 변수 20으로 변경
		
		System.out.println(p1.number);	
		System.out.println(p2.number); 	// p2의 number 변수만 20으로 바꿨지만 
														// p1, p2 가 참조하는 객체가 같기 때문에 
														// p1의 number 까지 값이 변경됌
	}
}
