package day0219.practice;

public class Computer4 {
	//클래스 변수
	private String company = "삼성";
	String model;
	String color;
	int inch;
	
	public String getCompany(){//getter
		return company;
	}
	// 생성자
	Computer4(String model, String color, int inch){
		this.model = model;
		this.color = color;
		this.inch = inch;
	}
	
	Computer4(String model, String color){
		// 다른 생성자 호출 
		this(model ,color,  0);
	}
	
	Computer4(String color){
		// 다른 생성자 호출
		this(null , color, 0);
	}
	
	
}
