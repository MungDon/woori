package day0306.stringbuilders;

public class StringBuilderEx01 {
	public static void main(String[] args) {
		// StringBuilder 객체생성
		StringBuilder sb = new StringBuilder();
		
		// .append(. .) : 문자열 끝에 매개값 추가
		sb.append("Java ");
		sb.append("program ");
		sb.append("Study");
		System.out.println(sb.toString());
		
		// .insert(index, 값) : index 에 값으로 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		// .setCharAt(index, 값)	:	index 에 있는 문자를 값으로 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		// .replace(시작(포함) ,미만, 변경값 )	:  시작부터 미만까지 변경값으로 대체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
	
		// .delete(시작 , 미만)		: 시작부터 미만까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		// .length() : 문자열의 크기, 개수 , 길이
		int len = sb.length();
		System.out.println("총 문자열의 수 : "+ len);
		
		// buffer 에 있는 것을 String 타입으로 리턴
		String result = sb.toString();
		System.out.println(result);
	}
}
