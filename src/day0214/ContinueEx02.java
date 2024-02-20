package day0214;

public class ContinueEx02 {
	public static void main(String[] args) {
		// 1~100 3의 배수만 출력
		int num;
		for(num=1; num<=100; num++){	// 1~100반복
			if( num%3 != 0){			// 3의 배수가 아닌것
				continue;				// 증감식으로 ㄱㄱ
			}
			System.out.println("1~100까지 3의 배수 = "+num);
			// %3 == 0 : 3의 배수
		}
	}
}