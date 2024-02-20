package day0214;

public class ForEx08 {
	public static void main(String[] args) {
		// 합이 100을 넘을 때의 num 구하기
		int sum = 0;
		int num = 0;
		for(num=0; sum<100; num++){
			sum += num;	// 1+2+...+? < 100
		}
		System.out.println("num : "+num);
		// 조건식이 false라서 반복을 수행 안할뿐 증감식에서 이미 +1 되어서 15
		// 합이 100을 넘었을 때의 num 값은 14이다.
		System.out.println("sum : "+sum);
		// 조건식이 false라서 반복을 수행 안할뿐 105라는 값이 대입 되어있음.
	}
}