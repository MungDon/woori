package day0214;

public class ForEx03 {
	public static void main(String[] args) {
/*
		for(①초기식; ②조건식; ④증감식) { 
			③실행문;
		}
*/		
		// 1~100 합
		// 반복 할 수, 합을 담을 변수
		int num , sum = 0;
		for( num=1; num<=100; num++ ){
			sum += num;	// 1+2+3+...+100	
		}
		System.out.println("1~100까지의 합 = "+sum);

		// 
		int num1;
		int sum1 = 0;
		for(num1=2; num1<=100; num1+=2 ){
			sum1 += num1;	// 2+4+6+8+....+100
		}
		System.out.println(sum1);
	}
}