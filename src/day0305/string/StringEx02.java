package day0305.string;
/*
 		String class
 			 - 자바 문자열을 사용할 수 있도록 String 클래스를 제공
 			 	1) 문자열을 다양한 생성자를 이용하는 방식
 			 	2) 코드상에서 리터럴 String 객체 자동 생성
 */
public class StringEx02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);			// new 새로운객체 -> 서로 주소 다름
		System.out.println(str1.equals(str2));	// 객체가 가진 문자열을 비교
		
		String str3 = "abc";
		String str4 = "abc";

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
