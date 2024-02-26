package day0226.pollymorphism;

public class Main02_1 {
	public static void main(String[] args) {
		Car car = new Car();

		// run() 반복
		for (int i = 1; i <= 8; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 HankookTire 교체");
					car.frontLeft = new HankookTire("앞 왼쪽", 15);
					break;
				case 2 : 
					System.out.println("앞 오른쪽 KumhoTire 교체");
					car.frontRight = new KumhoTire("앞 오른쪽", 13);
					break;
				case 3 : 
					System.out.println("뒤 왼쪽 HankookTire 교체");
					car.backLeft = new HankookTire("뒤 왼쪽", 14);
					break;
				case 4 :
					System.out.println("뒤 오른쪽 KumhoTire 교체");
					car.bakcRight = new KumhoTire("뒤 오른쪽", 12);
					break;
			}
			//1회전시 출력되는   내용 구분선 
			System.out.println("========================");
		}
	}
}
