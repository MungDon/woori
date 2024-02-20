package day0207;

public class VarEx02 {
	public static void main(String[] args) {
		int age;	// 선언 : 타입 이름;
		age = 10;	// 대입 : 이름 = 값;
		System.out.println(age);	// 변수 age의 값 읽기

		int level;
		//System.out.println(level); 변수에 값이 없으면 사용 불가

		// 선언과 대입 한번에 가능
		int num = 5;	// 최초의 값 대입 : 초기화
		System.out.println(num);

		int result = age+num;
		System.out.println(result);
	}
}