package day0307;

import java.util.Scanner;

public class L {
//8번 문제
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("10 이하의 숫자를 입력해주세요");

		while (true) {
			int num = sc.nextInt();
			if (num > 10) {
				System.out.println("10 이하의 수를 입력해주세요");
				continue;
			}
			for (int i = 1; i <= num; i++) {
				System.out.println("hello world");
			}
		}

	}
}
