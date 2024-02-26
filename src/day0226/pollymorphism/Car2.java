package day0226.pollymorphism;

/*
 	 배열 
 	 	 - 동일한 타입은 배열로 관리 하는것이 편하다
 	 	  - 인덱스 번호를 사용 ->  대입, 제어문 사용 편하다
 */
public class Car2 {
	Tire[] tires = {
			new Tire("앞 왼쪽",6), 
			new Tire("앞 오른쪽",2),
			new Tire("뒤 왼쪽", 3),
			new Tire("뒤 오른쪽", 4)
	};
	
	public int run() {
		System.out.println("[자동차가 달립니다]");
		for(int i  =0 ; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	public void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
