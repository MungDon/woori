package day0216.practice;

public class KroeanMain {

	public static void main(String[] args) {
		//객체 생성
		Korean k1 = new Korean("sung", 1); 
		Korean k2 = new Korean("min", 2);
		Korean k3 = new Korean("hyeong", 3);
		
		System.out.println("국적 : "+k1.nation+" 이름 : "+k1.name +" "+ "주민번호 : "+k1.num);
		System.out.println("국적 : "+k2.nation+" 이름 : "+k2.name +" "+ "주민번호 : "+k2.num);
		System.out.println("국적 : "+k3.nation+" 이름 : "+k3.name +" "+ "주민번호 : "+k3.num);
		
		//다른 객체인지 확인
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
	}

}
