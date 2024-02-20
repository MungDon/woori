package day0219.practice;

public class Computer4Main {

	public static void main(String[] args) {
		// 객체 생성
		Computer4 c1 = new Computer4(" 갤럭시북 ", " 흰색  ", 15);
		System.out.println("변경 전 " + c1.getCompany() + c1.model + c1.color + c1.inch);

		c1.model = " 갤럭시탭 ";
		c1.color = " 노란색 ";
		c1.inch = 20;
		System.out.println("변경 후 " + c1.getCompany() + c1.model + c1.color + c1.inch);

		Computer4 c2 = new Computer4(" 갤럭시탭 ", " 검은색 ");
		System.out.println("변경 전 " + c2.getCompany() + c2.model + c2.color + c2.inch);

		c2.model = " 갤럭시 s24 ";
		c2.color = "분홍색";
		c2.inch = 8;
		System.out.println("변경 후 " + c2.getCompany() + c2.model + c2.color + c2.inch);

		Computer4 c3 = new Computer4(" 분홍색 ");
		System.out.println("변경 전 " + c3.getCompany() + " " + c3.model + c3.color + c3.inch);

		c3.model = " 갤럭시 버즈 ";
		c3.color = " 흰색 ";
		c3.inch = 5;
		System.out.println("변경 후 " + c3.getCompany() + c3.model + c3.color + c3.inch);

	}

}
