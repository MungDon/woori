package day0214;

public class BreakEx01 {
	public static void main(String[] args) {
/*
		break문
		반복문에서도 마찬가지!
		break문을 만나면 그 지점에서 더이상 수행하지 않고
		반복문을 빠져나옴.
*/		
		// sum의 값이 100을 넘을 때의 num값
		// ForEx08 참고!
		int sum = 0;
		int num = 0;
		for(num=0; ; num++){	// 조건식 대신 if문, break; 사용
			sum += num;
			if(sum >= 100){
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}
}