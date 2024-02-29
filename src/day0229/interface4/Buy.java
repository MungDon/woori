package day0229.interface4;

public interface Buy {
		void buy();
		
		// 이름이 같은 정적메소드
		default void order() {
			System.out.println("구매 주문");
		}
		
		// 이름이 같은 정적메소드
		static void pay() {
			System.out.println("buyPay");
		}
}
