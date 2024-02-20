package day0208;

public class OperEx01 {
	public static void main(String[] args) {
		// 부호 연산자 ( + , - )
		// 양수 음수 더하기 빼기
		int num1 = 10;
		int num2 = 20;
		System.out.println(+num1);
		System.out.println(-num2);	// 대입 된것 아님
		System.out.println(num2);	// 값이 바뀐것은 아님

		num2 = -num2;	// 대입을해야 값이 바뀐다
		System.out.println(num2);
	}
}