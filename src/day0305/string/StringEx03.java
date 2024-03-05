package day0305.string;

public class StringEx03 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";

		// .length(); 문자열의 길이, 크기, 개수
		int len = str.length();
		System.out.println(len);

		// .replace() : 특정 문자열을 다른 문자열로 대체함
		// : java 프로그래밍
		String str2 = str.replace("자바", "java");
		System.out.println(str2);

		// .subString(int 시작 index(포함)) : 시작부터 끝까지
		// 문자열 잘라내기
		String str3 = str.substring(4);
		System.out.println(str3);

		// .substring(시작(포함), 끝(미만))
		String str4 = str.substring(3, 5);
		System.out.println(str4);

		// .indexOf() : 문자열에서 특정문자열의 위치
		int i = str.indexOf("프로그래밍");
		System.out.println(i);
		if (i == -1) {
			System.out.println("포함되어있지 않습니다");
		} else {
			System.out.println("포함되어있다");
		}

		System.out.println();

		// .contains() : 단순히 포함 여부를 물을 때
		// 있으면 true 없으면 false return
		boolean contains = str.contains("프로그래밍");

		if (contains) {
			System.out.println("포함되어있다");
		} else {
			System.out.println("미포함");
		}

		System.out.println();

		// 문자열 분리
		// .split() : 구분할 수 있는 것으로 분리할때
		String str5 = "사과,딸기,포도,복숭아,바나나";
		String[] tokens = str5.split(",");
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]);
		System.out.println(tokens[4]);

		System.out.println();

		for (int i1 = 0; i1 < tokens.length; i1++) {
			System.out.println("token[" + i1 + "] : " + tokens[i1]);
		}

		System.out.println();

		for (String t : tokens) {
			System.out.println(t);
		}

		System.out.println(str.toString());
		
		System.out.println();
		// .valueOf() : static -> 클래스이름.메서드(매개값);
		//매개값을 문자열로 리턴
		String str6 = String.valueOf(456);
		System.out.println(str6);
		
		// .parseInt() : 문자열을 int 타입으로 변환
		// 이때, 정수로 변환 할 수 있는 문자열
		int str7 = Integer.parseInt("1000");
		System.out.println(str7);
		
	}

}
