package day0229.interface1;

public class MyClassA implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassA - method1() 실행");
	}

}
// 완성된 프로그램
// 기능의 추가가 필요하다면 
// MyInterface에 기능 추가해야한다