package day0213.conditional;

public class IfEx04 {
	public static void main(String[] args) {
/*
		if-else if-else문
		하나의 상황에 조건이 여러개인 경우에 사용.
		하나의 조건에 만족하면 이후의 조건은 비교하지 않는다.
*/		
		int age = 12;
		int charge;
		if(age < 8){
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}else if(age < 14){	// ture. 이후의 조건 확인하지 않는다
			charge = 2000;
			System.out.println("초등학생 입니다");
		}else if(age < 20){	// 여러개 사용 가능
			charge = 2500;
			System.out.println("중고등학생 입니다");
		}else{				// 문법상 제일 마지막에 위치
			charge = 3000;
			System.out.println("성인 입니다.");
		}	// if끝
		System.out.println("입장료는 "+charge+"원 입니다.");
	}
}