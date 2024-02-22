package day0222.array;

public class ArrayEx01 {
	public static void main(String[] args) {
		// 배열 생성의 3가지 방법
		int[] arr1 = new int[5];
		int[] arr2 = {10,20,30,40,50};
		int[] arr3 = new int[] {10,20,30,40,50};
		
		//배열이름[순서] - n개 개수 / 순서 n-1(0부터시작)
		// .length
		
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		arr1[3] = 40;
//		arr1[4] = 50;
		
		for(int i = 0; i<arr1.length; i++) { // 반복하여 arr1배열의 방마다 값 대입
			arr1[i] = (i *10)+10;
		}
		
		for(int i = 0; i<arr1.length; i++) {	// 반복하여 arr1 배열의 방마다 값 확인
			System.out.println("arr1["+i+"] : "+arr1[i]);	
		}
	}
}
