package day0213.conditional;

public class IfEx02 {
	public static void main(String[] args) {
/*
		if-else문
		조건식을 만족하는 경우, 만족하지 않는 경우 모두 나타낼 때 사용.
		if(조건식){
			// 조건식 true
			실행문1;
		}else{
			// 조건식 false
			실행문2;
		}
*/

		int age = 2;
		if(age >= 8){
			System.out.println("학교에 다닙니다.");
		}else{	// 선택적 사용
			System.out.println("학교에 다니지 않습니다.");	
		}
	}
}