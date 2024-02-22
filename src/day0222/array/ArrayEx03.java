package day0222.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		double[] dou = new double[5];
		
		//0~2번 까지의 요소만 값 저장
		dou[0] = 10.0;
		dou[1] = 20.0;
		dou[2] = 30.0;
		
		for(int i = 0; i < dou.length; i ++) {
			System.out.println("dou["+i+"] : "+dou[i]);
		}
		
		for(double i : dou) {
			System.out.println(i);
		}
	}

}
