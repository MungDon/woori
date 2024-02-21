package day0221.arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		// .length : 개수 , 크기 , 길이
		// 인덱스 : [] - 순서(0부터 시작)
		int[] a = new int[4];
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// 개수 출력
		System.out.println("a배열의 개수 : " + a.length);
		System.out.println("b배열의 개수 : " + b.length);

		System.out.println("======");
		System.out.println("int[]a");

		// for문으로 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] 값 : " + a[i]);
		}
		System.out.println();
		System.out.println("int[]b");

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] 값 : " + b[i]);
		}

		System.out.println();
		System.out.println("변경 후 int[]a");

//		a[0] = 5;
//		a[1] = 6;
//		a[2] = 7;
//		a[3] = 8;

		for (int i = 0; i < a.length; i++) { // 반복문으로 a[i]값 대입
			a[i] = i + 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] 값 : " + a[i]);
		}

		System.out.println();
		System.out.println("변경 후 int[]b");

		for (int i = 0; i < b.length; i++) { // 반복문으로 b[i]값 대입
			b[i] += 1;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] 값 : " + b[i]);
		}
		
		/*	향상된 for 문
		 * for(변수선언 : 반복대상){
			System.out.println(변수);
			}
		*/
		
		System.out.println("======");
		for(int x : b ) {
			System.out.println(x);
		}
	}

}
