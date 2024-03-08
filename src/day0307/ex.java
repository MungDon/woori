package day0307;

import java.util.Scanner;

class Sum{
	public static void loof() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			String input = sc.nextLine();
			for(int i = 0; i<input.length(); i++) {
				char c = input.charAt(i);
				int n = Character.getNumericValue(c);
				sum += n;
			}
			System.out.println("입력하신 번호의 각 자리수를 더한값은?  "+sum);
		}
	}
}




// 9번문제
public class ex {
	public static void main(String[] args) {
		System.out.println("각 자리수의 합을 구해드립니다");
		System.out.println("숫자를 입력해주세요");
			Sum.loof();
			
		}
	
}
