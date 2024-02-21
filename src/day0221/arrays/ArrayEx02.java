package day0221.arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
//		String[] str = {"a","b","c","d"};
//		System.out.println(str);
		
		int[] arr = new int[3];
		System.out.println(arr[0]);
		
		arr[0]++; // 기본값 변수처럼 증감 사용가능
		System.out.println(arr[0]);
		System.out.println(arr[0]+10);

		System.out.println(arr[1]);
		arr[1] = arr[0];
		System.out.println(arr[1]);
	}

}
