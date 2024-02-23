package day0223.practice;

/*Car 클래스의 자손 클래스*/
public class SportsCar extends Car {
	@Override
	public void speedUp() { // final없는 메소드라서 override가능
		speed+=2;
	}
//	@Override
//	public final void stop() { // 부모 클래스의 메소드가 final 이기 때문에 override 불가능
//		System.out.println("stop");
//		speed =1;
//	}
}
