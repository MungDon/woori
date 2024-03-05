package day0305.api;
/*
 		.equals()
 			- 원형  : 두 객체(인스턴스)의 주소값을 비교하여 boolean 값 (T/F)으로 리턴(반환)
 			- 물리적 동일성 : 주소가 같음
 			- 논리적 동일성 : 객체에 저장된 메모리의 값이 같음
 */

class Student {
	// 변수
	String studentName; // 학생이름
	int studentId; // 학번

	// 생성자
	Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}

	// 메서드
	@Override
	public String toString() {
		String result = studentName + ", " + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {		// 타입 먼저 확인 - > true : 아래 if 문 실행
			Student student = (Student) obj;	
			if (studentId == student.studentId) {	// 학번이 같은지 확인 -> true : true 리턴
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	// 해시코드 값으로 학번을 받도록 재정의(오버라이딩)
	public int hashCode() {		
		return studentId;
	}

}

public class ObjectEx02_1 {

	public static void main(String[] args) {
		Student studentA = new Student("성", 2024);
		Student studentA2 = studentA; // 주소 복사
		Student studentB = new Student("민", 2024);

		// 동일한 주소의 두 객체 비교
		if (studentA == studentA2) {
			System.out.println("studentA 와studentA2의 주소가 같습니다.");
		} else {
			System.out.println("studentA 와studentA2의 주소가 다릅니다");
		}

		
		System.out.println();

		if (studentA.equals(studentA2)) {
			System.out.println("studentA 와studentA2는 동일합니다");
		} else {
			System.out.println("studentA 와studentA2는 동일하지않습니다");
		}

		System.out.println();

		if (studentA == studentB) {
			System.out.println("studentA 와studentB의 주소가 같습니다.");
		} else {
			System.out.println("studentA 와studentB의 주소가 다릅니다");
		}

		System.out.println();

		if (studentA.equals(studentB)) {
			System.out.println("studentA와 studentB의 동일합니다");
		} else {
			System.out.println("studentA 와studentB는 동일하지않습니다");
		}
		
		System.out.println();
		
		// .hashCode() 호출
		System.out.println("studentA의 해시코드 값 : "+studentA.hashCode());
		System.out.println("studentB의 해시코드 값 : "+studentB.hashCode());
		
		// 실제 객체의 주소값을 확인하는 메서드
		// .identityHashConde() 
		System.out.println("studentA의 실제 주소값 : "+System.identityHashCode(studentA));
		System.out.println("studentB의 실제 주소값 : "+System.identityHashCode(studentB));
		
	}

}
