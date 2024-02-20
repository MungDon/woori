package day0214;

public class BreakEx02 {
	public static void main(String[] args) {
		for(int a=1; a<=100; a++){
			if( a%5 == 0 ){ 
				break; 
			}
			System.out.println(a);
		}// for문 끝
		System.out.println("hello");
		System.out.println("java");
	}
}