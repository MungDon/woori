package day0223.practice;

/* Computer - Calculator
	 * 
	 * 오버라이딩
	 * 		- 메소드 재정의
	 * 		- 메소드가 오버라이딩 되었다면 조상의 메소드 숨겨짐.
	 * 			자손객체에서 메소드 호출하면 오버라이딩 된 메서드 호출 됨.
	 * 
	 * 	어노테이션(@Override)
	 * 		- 생략 가능
	 * 		- 메서드가 정확히 오버라이딩 되었는디 컴파일러가 체크함
	 * 			때문에 개발자의 실수 줄여줌.
	 * */
public class InheritanceEx03 {

	public static void main(String[] args) {
		Computer c = new Computer();
		Calculator c1 = new Calculator();
		
		int r = 10;
		
		double result1 = c.areaCircle(r); 				//Computer 객체의 areaCircle 메소드 호출, 대입하여 리턴값을 result1에 저장
		System.out.println("result : "+result1);		//result1 값 출력
		
		System.out.println();
		
		double result2 = c1.areaCircle(r); 			//Calculator 객체의 areaCircle 메소드 호출, 대입하여 리턴값을 result2에 저장
		System.out.println("reuslt : "+result2);		//result2 값 출력
	}

}
