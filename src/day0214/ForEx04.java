package day0214;

public class ForEx04 {
	public static void main(String[] args) {
		// 중첩 for문 (for문 속 for문)
		for( int a=1; a<=3; a++ ){
			for(int b=1; b<=3; b++){
				System.out.println(a+"=="+b);
			}
		}


		System.out.println("------------------");
		
		// for문 속 for문 2개
		for( int a=1; a<=5; a++){
			for(int b=1; b<=5; b++){ 
				System.out.println(a+"=="+b);
			}
			for(int b=1; b<=5; b++){	// 같은 이름의 변수 사용 가능.
										// {} 영역이 다르기 때문.
				System.out.println("hello");
			}
		}

		System.out.println("------------------");

		int c,d;
		for(c=1; c<6; c++){
			for(d=1; d<=5; d++){  }// d1의 끝
			for(d=1; d<=5; d++){  }// d2가 끝나고 c증감식으로..
		}
	}
}