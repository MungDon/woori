package day0220.statics;

class TvSchool {
	// 정적 인스턴스 변수
	static boolean power;
	static int channel;

	static { // 정적 초기화
		power = true;
		channel = 10;
	}
}

public class StaticEx02 {

	public static void main(String[] args) {
		System.out.println(TvSchool.power);
		System.out.println(TvSchool.channel);

	}

}
