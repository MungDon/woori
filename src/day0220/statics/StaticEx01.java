package day0220.statics;
/*
 		정적(static)멤버
 			- 정적 변수 / 정적 메서드
 			- 메모리에 올라오는 순서가 다름.
 			- 프로그램이 시작됨과 동시에 메모리에 올라간다(사용준비완)
 				상주 메모리
 			- 객체 생성 없이 사용 가능.
 */


class Data{
	static int a = 10;
	int b = 1;
	
//	int c = 10;
//	static int d = c;	// 메모리에 올라가는 순서
	
	static void add() {
		System.out.println("a : "+a);
	}
	
	void bbb() {
		System.out.println("bbb메서드 실행");
	}
	
}


public class StaticEx01 {
	public static void main(String[] args) {
		System.out.println(Data.a);
		Data.add();
		
//		Data d = new Data();		|	
//		System.out.println(d.a);	|-> 사용가능하지만 이렇게 사용안함
//		System.out.println(d.b);	|
//		d.add();
//		d.bbb();
		
		
	}
}
