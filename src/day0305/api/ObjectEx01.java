package day0305.api;
/*
 		toString()
 			- 객체(인스턴스) 정보를 문자열로 리턴
 			- 원형 	: 객체의 클래스 이름과 주소값이 나옴
 						: 클래스이름@16진수 해시코드 값
 			- 상속받은 클래스들 중에는 미리 재정의한 클래스들이 많다
 						: 재정의(오버라이딩) 된 메서드가 호출 됨
 			- 메서드를 직접 재정의 한다면 객체의 참조변수를 이용해
 				원하는 문자열을 표현 가능
 */

class Book{
	// 변수
	String bookTitle;	//책제목
	int bookNumber;	//책번호
	
	//	생성자
	// 책제목과 책번호를 매개값으로 받음
	Book(String bookTitle, int boolNumber){
		this.bookTitle = bookTitle;
		this.bookNumber = boolNumber;
	}
	@Override
	// 책 제목, 번호 정보를 가져오도록 구현부 변경(오버라이딩)
	public String toString() {
		String result ="책제목 : "+bookTitle+" 책번호 : "+bookNumber;
		return result;
	}
	
	
}

public class ObjectEx01 {
	public static void main(String[] args) {
		//객체 생성
		Book book = new Book("자바의정석", 2024);
		System.out.println(book);
		// 참조변수 = > 객체의 정보(클래스이름, 주소) 확인
		// toString() 자동 호출
		//	Object 클래스의 toString() 메서드
		System.out.println(book.toString());
		
		
		// 출력결과가 클래스이름과 주소값이 아닌 경우
		// String, Integer 클래스 -> 이미 오버라이딩 되어있음
		String str = new String("test");
		System.out.println(str);
		
		Integer i = new Integer(100);
		System.out.println(i);
		
	}


}
