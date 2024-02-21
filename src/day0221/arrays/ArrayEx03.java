package day0221.arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 배열 순차적으로 값이 들어감.
		int[] arr = {10,20,30,40,50};
		
		for(int a = 0; a<5; a++ ) {
			System.out.println(arr[a]);
		}
		
		System.out.println("=========");
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
