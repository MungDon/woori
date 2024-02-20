package day0216.practice;

public class Car3Main {

	public static void main(String[] args) {
		
		Car3 c1 = new Car3("Hyundai", "Sonata", "black", 250);
		Car3 c2 = new Car3("Kia", "niro", "random");
		Car3 c3 = new Car3("BMW", "x6");
		Car3 c4 = new Car3("Porsche");
		Car3 c5 = new Car3();

		System.out.println("회사 : " + c1.company + " 차종 : " + c1.model + " 색상 : " + c1.color + " 속도 : " + c1.speed);
		System.out.println("회사 : " + c2.company + " 차종 : " + c2.model + " 색상 : " + c2.color);
		System.out.println("회사 : " + c3.company + " 차종 : " + c3.model);
		System.out.println("회사 : " + c4.company);
		System.out.println(c5.company);
		
		c1.color = "파랑";
		System.out.println(c1.color);
	}

}
