package day0219.practice;

public class Computer3Main {

	public static void main(String[] args) {
		// 객체 생성 시 매개변수 순서 지켜야함!
		
		//매개변수4개 생성자 호출
		Computer3 c1 = new Computer3("삼성" , "갤럭시 북" , "흰색" , 18);
		System.out.println("c1 = "+"제조사 : "+c1.company +", 모델명 : "+c1.model+", 색상 : "+c1.color+", 크기  : "+c1.inch);
		
		//매개변수3개 생성자 호출
		Computer3 c2  = new Computer3("LG", "그램","검은색");
		System.out.println("c2 = "+"제조사 : "+c2.company +" 모델명 : "+c2.model+", 색상 : "+c2.color);
		
		//매개변수2개 생성자 호출
		Computer3 c3 = new Computer3("레노버", "아이디어 패드 슬림");
		System.out.println("c3 = "+"제조사 : "+c3.company +", 모델명 : "+c3.model);
		
		//매개변수1개 생성자 호출
		Computer3 c4 = new Computer3("HP");
		System.out.println("c4 = "+"제조사 : "+c4.company);
	}

}
