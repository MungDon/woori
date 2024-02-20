package day0214;

public class ContinueEx01 {
	public static void main(String[] args) {
/*
		continue문
		반복문 안에서 continue;를 만나면
		이후의 코드 실행하지 않고 증감식으로 가서 for문 수행.
		반복문 수행 중 특정 조건에서는 수행하지 않고 건너뛰어야 할 때 사용.
*/		
		int a;
		for(a=1; a<=3; a++){
			if( a == 3 ){	// a가 3일 경우
				continue;	// 이후 코드 진행하지 않고 증감식으로 ㄱㄱ
			}
			System.out.println(a);
		}

		// 1~10까지 짝수 출력
		for(a=1; a<=100; a++){
			if( a%2 == 1 ){
				continue;
			}
			System.out.println(a);
		}

		// 1~100 홀수의 합
		// 합 , 반복 -> 변수 2개 필요
		int sum = 0;
		int num;
		for( num=1; num<=100; num++ ){	// 1~100까지 반복
			if( a%2 == 0 ){		// 짝수인 경우
				continue;		// 이후 코드 진행하지 않고 증감식으로
			}
			sum += num;			// 홀수만 += 됨.
		}
		System.out.println("1~100까지 홀수의 합 = "+sum);
	}
}