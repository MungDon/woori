package day0305.string;

public class StringEx04 {

	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = " hello world ";
		String s3 = "HELLO WORLD";
		System.out.println(s1.charAt(0));							//0번째의 문자 리턴
		System.out.println(s1.indexOf('w'));					//문자의 위치 리턴
		System.out.println(s1.indexOf('k'));						// 해당 문자가 없을때 -1 리턴
		System.out.println(s1.lastIndexOf('l'));				// 마지막에 오는 해당 문자의 위치 
		System.out.println(s1.replace('h', 'a'));				// 왼쪽을 오른쪽으로 대체					
		System.out.println(s1.replaceAll("hello", "aaa"));	// 문자열을 바꿔서 리턴
		System.out.println(s1.toUpperCase());					// 소문자를 대문자로 변환 후 리턴
		System.out.println(s3.toLowerCase());					// 대문자를 소문자로 변환 후 리턴
		System.out.println(s1.substring(6));						// index 6번부터 끝까지 자른부분을 리턴
		System.out.println(s1.substring(6, 9));					// index 6번포함, 9번 미만의  자른 값을 리턴
		System.out.println(s1.length());							// 문자열 개수 크기 길이 리턴
		System.out.println(s2.trim());								// 문자열의 앞 뒤에 있는 공백 제거 한 후 리턴
	
		System.out.println();
		
		String s4 = "java html css jsp spring";
		String[] s = s4.split(" ");
		for(String a : s) {
			System.out.println(a);
		}
	
	
	}

}
