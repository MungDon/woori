package day0208;

public class VarEx01 {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2;		// int형 값이 float형 변수로 대입
		System.out.println(iNum2);
		System.out.println(fNum);

		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}
}