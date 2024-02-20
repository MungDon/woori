package day0214;

public class BreakEx03 {
	public static void main(String[] args) {
		// 중첩 반복문 속 break;문
		int a , b;
		for(a=1; a<=5; a++){
			for(b=1; b<=5; b++){
				if(b == 3){ 
					break;	// 가장 가까운 for문 종료.
							// b for문 종료.
				}
				System.out.println(a+"=="+b);
			}
		}
	}
}