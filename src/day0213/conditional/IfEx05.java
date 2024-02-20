package day0213.conditional;

public class IfEx05 {
	public static void main(String[] args) {
		int age = 10;
		int charge = 0;
		int i = 10;

		if(age < 8){
			charge = 1000;
		}
		if(age < 14){
			charge = 2000;
		}
//		if(age < 20 && (i+=2) < 0){	// 앞이 true이기 때문에 뒤쪽 연산 한다.
//			charge = 2500;
//		}
		if(age < 20 || (i+=2) < 0){	// 앞이 true이기 때문에 뒤쪽 연산 안함.
			charge = 2500;
		}
		System.out.println("입장료는 "+charge+"원 입니다.");
		System.out.println(i);
	}
}