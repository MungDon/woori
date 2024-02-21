package day0221;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("010");  		// 객체생성 후 주민번호 입력
		
		p1.setName("홍길동");					//	setName 메서드 호출 후 name 값 입력
		
		String name = p1.getName();			// 객체 안에 name 값 가져온뒤 name 이라는 이름으로 저장
		System.out.println(name);				// 저장된 name 값 출력
		System.out.println(p1.getNUM());	// 객체안 NUM에 저장된 값 출력
	
		p1.setName("오왕아dddd");				//	객체 안 name 값에 입력  하지만 set 메서드 조건식에 어긋나기에 에러발생하고 저장 안됌
		String name2 = p1.getName();			//객체안 name 에  저장된 name 값 가져옴
		System.out.println(name2);				// 조건식 false 이기때문에 대입 불가 따라서 전에 저장된 값 출력
	}

}
