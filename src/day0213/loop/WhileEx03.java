package day0213.loop;

public class WhileEx03 {
	public static void main(String[] args) {
		// 1~10까지의 합
		// 1+2+3+4+5+6+7+8+9+10
		// 두가지 필요 : 합이 될 변수 , 반복할 변수
		int sum = 0;
		int num = 1;
		while(num <= 10){
			sum += num;
			num++;
		}
		System.out.println("1~10까지의 합 = "+sum);
	}
}