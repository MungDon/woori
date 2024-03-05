package day0305.api;
/*
 		.clone()
 			- 원복 객체를 복사(복제)
 			- 동일한 값을 가지는 새로운 객체 생성
 				: 원본 객체를 보호 할 때 사용한다.
 			- 반드시 원본 객체에 java.lang.Cloneable 인터페이스 구현해야함
 				: 하지 않으면 예외 발생 -> 예외처리 필 수
 */
public class ObjectEx04 {
	public static void main(String[] args) {
		Member origin = new Member("java","min","123",10,true);
		
		//복제 객체를 받음
		Member clone = origin.getMember();
		clone.password = "12345678";	 // 복제객체의 비밀번호 변경
		
		System.out.println("[원복객체의 값] ");
		System.out.println("id : "+origin.id);
		System.out.println("name : "+origin.name);
		System.out.println("password : "+origin.password); // 변경 유무 확인
		System.out.println("age : "+origin.age);
		System.out.println("adult : "+origin.adult);
		
		System.out.println("=================");
		
		System.out.println("[복제 객체의 값] ");
		System.out.println("id : "+clone.id);
		System.out.println("name : "+clone.name);
		System.out.println("password : "+clone.password);
		System.out.println("age : "+clone.age);
		System.out.println("adult : "+clone.adult);
	}
}
