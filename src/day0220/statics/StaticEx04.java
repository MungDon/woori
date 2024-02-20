package day0220.statics;

class Tv{
	static String company = " SAMSUNG ";
	static String model = " LCD ";
	static String info;
	
	static { //정적 변수 초기화 / 생성자의 역할과 비슷하다
		info = company + model;
	}
}

public class StaticEx04 {

	public static void main(String[] args) {
		System.out.println(Tv.info);

	}

}
