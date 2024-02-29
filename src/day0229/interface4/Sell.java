package day0229.interface4;

public interface Sell {
	void sell();
	// 이름이 같은 정적메소드
	default void order() {
		System.out.println("판매완료");
	}
	// 이름이 같은 정적메소드
	static void pay() {
		System.out.println("sellPay");
	}
}
