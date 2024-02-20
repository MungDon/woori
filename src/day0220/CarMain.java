package day0220;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car(); // 객체 생성
		car1.setGas(5); // gas 값에 5 setting

		if (car1.isGas()) {
			System.out.println("출발");
			car1.run();
		}
		System.out.println("가스를 넣어주세요");

	}

}
