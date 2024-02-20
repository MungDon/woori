package day0208;

public class OperEx14 {
	public static void main(String[] args) {
		byte b = (byte)(100+30);	// -128 ~ 127
		System.out.println(b);
		
		int i = 100000 * 100000;	 
		System.out.println(i);
		
		long l = 100000L * 100000L;	// int의 범위를 넘어서기 때문에 식별자 L 사용
		System.out.println(l);
	}
}