package day0219.practice;

public class ComputerMain {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스 참조 변수이름 = new 클래스();
		Computer c = new Computer();
		// 객체의 주소 확인
		// 클래스의 풀네임 : 패키지.클래스@ 고유 해시코드
		System.out.println(c);
		
		//값 읽기
		System.out.println("제조사 : "+c.company);
		System.out.println("모델명 : "+c.model);
		System.out.println("색상 : "+c.color);
		System.out.println("크기 : "+c.inch);
		
		// 값의 변경
		c.inch= 17;
		System.out.println("수정 후 크기 :  "+ c.inch);
	}

}

