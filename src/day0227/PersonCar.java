package day0227;
//Car 클래스의 자손클래스 2
public class PersonCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 방향을 바꿉니다");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟고 정지합니다");
	}	
}
class Ex02 {
	int a; 
	boolean isPlay;
	double d;
	
	public void setA() {
		this.a = 15;
	}
	public void setIsPlay() {
		this.isPlay = true;
	}
	public void setD() {
		this.d = 1.1;
	}

}
