package day0221;

public class Person {
	// 이름, 주민번호
	private String name;				// 이름	
	
	private final String NUM;		// 주민번호


	Person(String NUM) {				// 생성자 (NUM초기화)
		this.NUM = NUM;
	}

	public String getNUM() {		// NUM getter
		return NUM;
	}
	
	public void setName(String name) {	// name setter
		int len = name.length();				// name 의 문자열 길이를 len 에 저장
		try {
			if (len >= 2 && len <= 5) {			// 이름이 2~5자 내로 사용하도록 조건
				this.name = name;				// 조건식 true 일 경우 필드 name 값에 입력 name 값 대입
			} else {									
				throw new Exception("2~5자 내로 정해주세요");	//조건식 false 일경우 에러 강제 발생
			}
		} catch (Exception e) {
			System.out.println("경고 : " + e.getMessage());			// 예외 잡아서 경고 메세지 출력
		}

	}

	public String getName() {	// name getter
		return name;
	}

}
