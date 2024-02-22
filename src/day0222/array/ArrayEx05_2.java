package day0222.array;

//Book 객체 생성 실행 클래스 2
public class ArrayEx05_2 {

	public static void main(String[] args) {
			Book[] lib = new Book[5];
			
			//인스턴스 생성 후 배열에 저장
			lib[0] = new Book("민","bb");		//매개변수 2개짜리 생성자 
			lib[1] = new Book("형","cc");
			lib[2] = new Book("성","dd");
			lib[3] = new Book("sung","ee");
			lib[4] = new Book("min","ff");
			
			
			for(int i = 0; i < lib.length; i++) {// [0]~[4] 의 Book 인스턴스의 주소
				System.out.println("lib["+i+"] : "+lib[i]);
			}
			
			System.out.println();
			
			for(int i = 0; i < lib.length; i++) { // 주소가 가지고있는 bookInfo메서드 호출
				lib[i].bookInfo();
			}
	}

}
