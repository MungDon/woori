package day0213.loop;

public class WhileEx05 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while( i<=100 ){
			sum += i;	// 1+2+3+4+....+100
			i++;
		}
		System.out.println("1~"+(i-1)+"까지의 합 : "+sum);
								// 마지막에 1증감하기 때문에 -1 해준다 
	}
}