package day0226.pollymorphism;

/*
 		메서드 호출 - 보통 타입을 맞춰 호출.
 		매개값을 다양화 하기 위해 
 		매개변수에 자식 객체를 지정 할 수 있다.
 */
public class Main03 {
	// . driver() 메서드는 매개변수 타입  : 조상(vehicle)의 것으로 선언
	// 자식 객체로 자동 타입 변환
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // Vehicle v1 = bus;와 같다
		driver.drive(taxi);// Vehicle v2 = taxi;와 같다
		//메서드 호출(사용) 시 자식객체에서 오버라이딩된 메서드가 사용 됨
		
	}

}
