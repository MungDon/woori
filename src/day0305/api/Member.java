package day0305.api;

public class Member implements Cloneable { // implements Cloneable 복제 가능한것을 명시
	// 변수
	public String id; 					// 아이디
	public String name;				// 이름
	public String password;		// 비밀번호
	public int age; 				// 나이
	public boolean adult; 			// 성인인증
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// 메서드
	public Member getMember() {
		Member clone = null;
		//예외 처리 필수 
		try {
			clone = (Member)clone();		// clone() 사용할 시 Object 타입으로 리턴, 따라서 강제 타입 변환 해줘야한다
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
