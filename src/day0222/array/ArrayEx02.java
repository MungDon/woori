package day0222.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] scores = { 70, 85, 87, 90 };

		// 총 합 구하기
		int sum = 0;	//합을 담을 sum 변수 초기화

		for (int i = 0; i < scores.length; i++) { // 반복하여 배열값의 합을 구함
			sum += scores[i];
		}

		System.out.println(sum);	// 합 출력
		System.out.println();

		for (int i : scores) {		// 향상된 for 문으로 배열 인덱스 값 출력
			System.out.println(i);
		}

		System.out.println();

		int sum2 = 0;		// 배열의 합을 담을 sum2 변수 초기화
		for (int i : scores) {	// 향상된 for 문으로 배열의 합을 구함
			sum2 += i;				
		}
		System.out.println(sum2);	//합을 출력	
	}

}
