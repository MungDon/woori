package day0305.string;

/*
 		java.lang.StringBuilder 클래스, StringBuffer 클래스
 			- 문자열을 변경하거나 연결해야할 때 사용
 			-일반적 String 
 				 String	str = "hello";
 						 	str += " world";
 						"hello world"
 				: 한개의 string 객체가 사용되었다고 생각하지만
 						새로운 String 객체가 생성되었고
 						str 변수가 새로운 객체를 참조한다. 
 			- 공통점 : 두 클래스는 내부버퍼(buffer : 데이터 임시저장 메모리)에
 							문자열을 저장해두고 그 안에서 추가 , 수정 , 삭제 가능
 							: 사용 방법 동일
 			- 차이점 : 여러작업(스레드)이 동시에 문자열을 변경하려고 할때
 							문자열이 안전하게 변경되도록 보장해 주는가 그렇지 아니한가 차이
 			
 			- StringBuffer : 안전하게 보장(멀티스레드 환경에서 사용가능하도록 동기화적용되어있음)
 			
 */
public class StringBuilderEx {
	public static void main(String[] args) {
		String str = new String("java");
		System.out.println("str 문자열 주소 : "+System.identityHashCode(str));
		
		// 주소가 같음 -> 하나의 메모리에 계속 연결 된다는 것을 알 수 있음.
		StringBuilder sb = new StringBuilder(str);
		System.out.println("추가전 sb 주소 : "+System.identityHashCode(sb));
		
		// .append() : 문자열추가
		sb.append(" programming");
		sb.append(" is");
		sb.append(" fun");
		System.out.println("추가후 sb 주소 : "+System.identityHashCode(sb));
		
		str = sb.toString();
		System.out.println(str);
		
		System.out.println("새로 대입된 str 주소 : "+System.identityHashCode(str));
	}
}
