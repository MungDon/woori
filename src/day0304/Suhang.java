package day0304;

import java.util.Scanner;

public class Suhang {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[] arr = new double[5];
		double result = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
			result += arr[i];
		}
		result /= arr.length;
		System.out.println("평균값은 : " + result);
	}

}
