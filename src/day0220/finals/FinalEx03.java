package day0220.finals;

class Fin{
	final int X =100;
	final static int Y = 500;
	final int Z;
	
	Fin(int Z){
		this.Z = Z;
	}
}

public class FinalEx03 {

	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);
//		a= 100;
//		System.out.println(a);

		System.out.println(Fin.Y);
//		Fin.Y = 13; //final 이라 변경 불가
		
//		Fin f = new Fin(50);
//		System.out.println(f.X);
//		System.out.println(f.Y);
//		System.out.println(f.Z);
		
		final int b = 10;
//		b = 20;
//		b++;
//		b+=1;
		
	
	
	
	}

}
