package day0307;

import java.util.Scanner;

public class No_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			String intValue = input.replaceAll("[^0-9]","");
			System.out.println(intValue);
		}

	}
}
