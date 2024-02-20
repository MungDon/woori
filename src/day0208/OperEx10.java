package day0208;

public class OperEx10 {
	public static void main(String[] args) {
		int num = 10;
		int a = 2;
		boolean result = 
			((num = num+10) < 10) && ((a = a+2) < 10);
			// num+=10					a+=2
		System.out.println(result);
		System.out.println(num);
		System.out.println(a);
	}
}