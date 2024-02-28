package day0227;
/*
 		템플릿 메서드
 			- 실행 순서 즉 시나리오가 정해진 대로 진행해야함 
 			- 로직의 흐름이 이미 정해져있는 프레임워크에서 사용.
 */
public class Main02 {
		public static void main(String[] args) {
			System.out.println("=====자율주행 자동차=====");
			Car car1 = new AICar();	//자동타입변환 : 상속
			car1.run(); // AICar의 오버라이딩한 내용이 나옴
			
			System.out.println("===사람이 운전하는 자동차===");
			Car car2 = new PersonCar(); //자동타입변환 : 상속
			car2.run(); // PersonCar의 오버라이딩한 내용이 나옴
		}
}
