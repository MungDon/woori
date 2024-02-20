package day0220.finals;

/*
  		final(상수)
  			- 변경 할 수 없는, 변경 불가의 의미.
  			- 클래스 앞에 붙으면 상속 받지 못함.
  			- 변수의 이름을 대문자로 사용해서 구별함.
 */

public class FianlEx01 {

	public static void main(String[] args) {
		// final 변수를 사용할 때 
		// 초기화 언제? - 선언과 동시에, 사용 전에
		final int MAX_NUM = 100; //선언가 동시에 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM );
		System.out.println(MIN_NUM );
		
//		MIN_NUM = 1000;  - >  다시 대입 불가능, 변경 불가.
	}

}
