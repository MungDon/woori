package day0214;

public class DoWhileEx01 {
	public static void main(String[] args) {
/*
		do-while문 { 실행문; }안의 실행부분 반드시 한번 실행 후 조건 검사.
		조건식이 만족하는지 마지막에 검사.
		{}영역안의 실행문을 반드시 실행해야 할 때 사용.
*/		
		// 1~10까지의 합
		int num = 1;
		int sum = 0;
		do{
			sum += num;
			num++;
		}while(num <= 10);
		System.out.println(sum);

		// 조건이 false일 때
		int number = 2;
		do{	// 반드시 한번 실행
			System.out.println("hello");
			System.out.println("hello");
			number++;
		}while(number == 1);	// 조건식 false
	}
}