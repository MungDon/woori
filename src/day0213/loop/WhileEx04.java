package day0213.loop;

public class WhileEx04 {
	public static void main(String[] args) {
		// 1~100 합
		// 합을 담을 변수, 반복할 변수
		int num = 1;
		int sum = 0;
		while(num <= 100){
			sum += num;	// 1+2+3++....+100
			num++;
		}
		System.out.println("1~100까지의 합 = "+sum);

		// 홀수 합
		int num2 = 2;
		int sum2 = 0;
		while(num2 < 101){
			sum2 += num2;
			num2+=2;
		}
		System.out.println(sum2);

		// 짝수 합

	}
}