package day0214;

public class ForEx07 {
	public static void main(String[] args) {
		// 반복문 <-> 조건문
		// 홀수 합, 짝수 합
		int num , odd = 0 , even = 0;	// ,로 한번에 선언할 때 초기값 유무 확인
		for( num=1; num<=100; num++ ){
			if( num%2 == 1 ){	// 홀수
				odd += num;		// 1+3+5+7+...+99
			}else{
				even += num;	// 2+4+6+8+...+100
			}
		}
		System.out.println("홀수 합 = "+odd);
		System.out.println("짝수 합 = "+even);
	}
}