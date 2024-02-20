package day0220.finals;

class Person{
	//final 변수의 초기화 방법
	//1. 선언과 동시에 초기화
	//2. 생성자 초기화
	final String nation = "KOREA";
	final String birth;
	String name;
	
	Person(String birth, String name){ //생성자
		this.birth = birth;
		this.name = name;
	}
}


public class FinalEx02 {

	public static void main(String[] args) {
		Person p1 = new Person("10/22", "성 민형");
		Person p2 = new Person("8/9", "민형 성");
		System.out.println("p1의 정보 = "+"국적 : "+p1.nation+" 생일 : "+p1.birth+", 이름 : "+ p1.name);
		System.out.println("p2의 정보 = "+"국적 : "+p2.nation+" 생일 : "+p2.birth+", 이름 : "+ p2.name);
		
//		p1.nation = "";		|		<- - final 이라 안됌
//		p1.birth = "";		|		<- - final 이라 안됌
		p1.name = "MinHyeong";
		System.out.println("변경 후 p1의 정보 = "+"국적 : "+p1.nation+" 생일 : "+p1.birth+", 이름 : "+ p1.name);
		
//		p2.nation = "";	|		<- - final 이라 안됌
//		p2.birth = "";	 	|		<- - final 이라 안됌
		p2.name = "MinYeong";
		System.out.println("변경 후 p2의 정보 = "+"국적 : "+p2.nation+" 생일 : "+p2.birth+", 이름 : "+ p2.name);
	}

}
