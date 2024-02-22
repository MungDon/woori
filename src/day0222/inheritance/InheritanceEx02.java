package day0222.inheritance;
/*
		super()
			- 조상의 생성자 호출
			- 자손의 생성자 내에서만 사용
			- 첫줄에만 사용 가능(this()와 함께 사용 불가능)
		
		오버라이딩	
			- 덮어쓰기
			- 선언부(매개변수 부분까지) 같고, 구현부가 다르다
		 	- 접근제어자 강하게(좁게) 못한다.
		 
		어노테이션
		 - @
		 - 구별 쉽게 알려주는 역할
		 - 생략 가능
		 - 오버라이딩 @Override
*/
class AA {
	//변수
	int x;

	//생성자
	public AA() {
		this(100);
	}
	
	public AA(int x) {
		this.x = x;
	}
	
	//메서드
	public void aa()//선언부 
	{
		System.out.println("조상의 메서드 AA"); // 구현부
	}
}

class BB extends AA{
	//변수
	int y;
	
	 BB(){
		 super(200); //  부모클래스 생성자 호출 
		 y = 500;
	 }
	 
	 //메서드
	 @Override
	 public void aa() {	// 부모 클래스 메서드와 선언부 같음 = >  오버라이딩 :  덮어쓰기
		 System.out.println("자손이 수정한 BB");
	 }
	 public void aa(int i ) {	// 이름만 같고 매개변수는 다름 = >오버로딩 :  동명이인
		 
	 }
}

public class InheritanceEx02 {

	public static void main(String[] args) {
		BB bb = new BB();
		System.out.println("bb.x : "+bb.x); 
		System.out.println("bb.y : "+bb.y);
		
		bb.aa();
		
		AA aa = new AA();
		aa.aa();
		System.out.println(aa.x); //상속받은 BB클래스에서 기본생성자로 x 의  값을 바꿔도 AA클래스 에서는 x 값이 바뀌지않는다.
	}

}
