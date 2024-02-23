package day0223.protected_1;

public class B {
	public void method() {
		A a = new A();		// 같은 패키지여서 객체 생성가능
		a.var = "value";	
		a.method();
	}
}
