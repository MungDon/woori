package day0226.pollymorphism;

/*
 		강제 타입 변환(Casting) - (int),(byte)...
 			- 부모 타입을 자식타입으로 변환하는 것.
 			- 모든 부모 타입을 자식타입으로 강제변환 할 수 있는 것은 아니다.
 			- 자식 타입이 부모 타입으로 자동 타입 변환 된 후
 			 	다시 자식 타입으로 변환 할 때 강제 타입 변환 사용.
 			 	
 			- 자식 -> 부모 : 자동변환
 				부모타입에 선언된 변수와 메서드만 사용 가능하다는 제약.
 			- 자식타입의 변수와 메서드를 사용해야 한다면 
 				-> 자식타입으로 강제 변환 후에 자식의 변수와 메서드를 사용하면된다 
 */
public class Main04 {

	public static void main(String[] args) {
		// 자동 타입 변환
		Parent2 parent2 = new Child2();
		parent2.var1 = "data1";
		parent2.method1();
		parent2.method2();

//		// 자식 객체만의 변수와 메서드
//		parent2.var2 = "data2";	// 불가능
//		parent2.method3();		// 불가능

		// 자식 객체로 변환
		// 강제 타입변환
		Child2 child2 = (Child2) parent2;
		child2.var2 = "aaa"; // 가능
		child2.method3(); // 가능

	}

}
