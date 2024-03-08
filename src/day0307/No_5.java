package day0307;

import java.util.HashSet;
import java.util.Scanner;

public class No_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet set = new HashSet();
		while(true) {
			String input = sc.nextLine().toLowerCase();
			for(int i = 0; i<input.length(); i++) {
				char cInput = input.charAt(i);
				set.add(cInput);
			}
			System.out.println(set.toString());
		}
		
	}

}
