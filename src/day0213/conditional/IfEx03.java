package day0213.conditional;

public class IfEx03 {
	public static void main(String[] args) {
		int age = 12;
		int charge;
		if(age < 8){
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		if(age < 14){	// true
			charge = 2000;	// 대입
			System.out.println("초등학생 입니다.");
		}
		if(age < 20){	// true
			charge = 2500;	// 대입
			System.out.println("중고등학생 입니다.");
		}else{
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		System.out.println("입장료는 "+charge+"원 입니다.");
	}
}