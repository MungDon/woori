package day0304.exception;

/*
 		ArrayIndexOutOfBoundsException : 배열에서 발생
 			- 인덱스 범위를 초과, 부족하게 사용할 경우 발생
 			- 매개값이 없는 경우.
 			- 길이(개수, 크기) 먼저 조사해야함.
 */
public class ExceptionEx02 {
	public static void main(String[] args) {
		if (args.length == 2) { // 개수가 2개인지 확인
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : "+args[0]);
			System.out.println("args[1] : "+args[1]);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsException");
			System.out.print("값1 값2");
		}

		// 매개값이 없어서 예외 발생
	}
}
