package day0222.inheritance;

/*
 		super. / super()
 			- 조상의 것을의미 
 		super.
 			- 조상의 변수 사용
 			- 자손의 변수와 이름이 같을때 사용.
 		
 		super()
 			- 	조상의 생성자 호출
 			-	자손의 생성자에서 사용가능 
 			- 	첫줄에서 사용가능 (this() 사용 불가능)
 */




class AAA{
	int x = 100;
}
class BBB extends AAA{
	int y = 111;
	int x = 222;	
	
	public void bb() {
		int x = 50;
		System.out.println("x : "+x);		// bb 메서드안에 지역변수 x
		System.out.println("this.x : "+this.x);	// BBB클래스 x
		System.out.println("super : "+super.x);	//AAA클래스 x
	}
}




public class InheritanceEx03 {

	public static void main(String[] args) {
		BBB bbb = new BBB();
			bbb.bb();
	}

}
