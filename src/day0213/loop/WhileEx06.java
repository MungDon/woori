package day0213.loop;

public class WhileEx06 {
	public static void main(String[] args) {
/*
		for(①초기식; ②조건식; ④증감식) { 
			③실행문;
		}

		①초기식;
		while(②조건식){
			③실행문;
			④증감식;
		}
*/		
		// while문 구구단
		int dan = 2;
//		int num = 1;	// 사용 안함
		while( dan<10 ){
			int num = 1;	// 바깥쪽 while문 내에서 반복을 할때 
							// num=1;이라는 초기화가 되지 않기 때문에
			while( num<=9 ){ 
				System.out.println(dan+" x "+num+" = "+(dan*num)); 
				num++; 
			}
			dan++;
			System.out.println();	// 보기 편한 줄바꿈
		}
	}
}