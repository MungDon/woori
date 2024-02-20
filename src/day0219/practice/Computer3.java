package day0219.practice;

public class Computer3 {
	// 클래스 변수 - 속성
	// 제조사 모델 색상 크기
	String company;
	String model;
	String color;
	int inch;
	
//	Computer3(String c){//주로 매개변수의 이름은 클래스 필드변수 이름과 같게 사용한다
//		company = c;
//	}
	
	// 생성자 오버로딩
	Computer3(String company){
		this.company = company;
	}
	
	Computer3(String company,String model){
		this.company = company;
		this.model = model;
	}
	
	Computer3(String company,String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	Computer3(String company,String model, String color, int inch){
		this.company = company;
		this.model = model;
		this.color = color;
		this.inch = inch;
	}
	
	

}
