package day0226.pollymorphism;

public class Main02_2 {

	public static void main(String[] args) {
		Car2 car2 = new Car2();
		
		for(int i = 1; i <=5 ; i++) {
			int problemLocation = car2.run();
			if(problemLocation != 0) {
				System.out.println(car2.tires[problemLocation-1].location+"HankookTire 로 교체"); // 펑크난 타이어 위치 불러와서 출력
				car2.tires[problemLocation-1] = new HankookTire(car2.tires[problemLocation-1].location ,15); // 펑크난 타이어에 한국타이어로 객체 생성후 위치 와 수명값 대입
			}
			System.out.println("==========");
		}
	}

}
