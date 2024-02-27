package day0227;

public class MobilePhone {
	String company;
	double width;
	double hight;
	double wight;
	
	public void call(String num) {
		System.out.println(num+"로 전화를 걸고 있습니다.");
	}
	public void ReceiveCall() {
		System.out.println("전화 받기");
	}
	public void sendMessage() {
		System.out.println("문자보내기");
	}
	public void receiveMessage() {
		System.out.println("문자 받기");
	}
}
