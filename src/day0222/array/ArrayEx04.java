package day0222.array;

public class ArrayEx04 {

	public static void main(String[] args) {
		double[] dou = new double[5];
		int size =0;
		dou[0] = 10.0;
		size++;
		dou[1] = 20.0;
		size++;
		dou[2] = 30.0;
		size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(dou[i]);
		} 
		
		System.out.println();
		
		for(int i = 0; i < dou.length; i++) {
			if(dou[i] != 0.0) {
				System.out.println(dou[i]);
			}
		}
	}

}
