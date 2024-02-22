package day0222.array;

public class Book {
	// 변수 // 캡슐화(변수에 대한것)
	private String writer;
	private String bookName;

	// 생성자
	public Book() {	//기본 생성자
	}

	public Book(String writer, String bookName) { // 매개변수 2개 짜리 생성자
		this.writer = writer;
		this.bookName = bookName;
	}

	// 리턴타입 메서드이름(){}//
	public void setBookName(String bookName) { // bookName Setter
		this.bookName = bookName;
	}

	public String getBookName() { // bookName Getter
		return bookName;
	}

	public void setWriter(String writer) { // writer Setter
		this.writer = writer;
	}

	public String getWriter() { // writer Getter
		return writer;
	}

	public void bookInfo() { // 책과 작가 정보 출력
		System.out.println("책이름  : " + bookName + ", 작가 이름 : " + writer);
	}

}
