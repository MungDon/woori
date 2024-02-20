package day0216.practice;

public class Car3 {
	
	String company = "g";		//회사
	String model;			// 차종
	String color;			//색상
	int speed;					//차 속도
	
	Car3(){} //기본 생성자 @NoArgsConstructor
	
	Car3(String company){ //   매개변수 1개
		this.company = company;
	}
	Car3(String company,String model){ //   매개변수 2개
		this.company = company;
		this.model = model;
	}
	Car3(String company, String model, String color){//   매개변수 3개
		this.company = company;
		this.model = model;
		this.color = color;
	}
	Car3(String company, String model, String color, int speed){//   매개변수 4개
		this.company = company;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
