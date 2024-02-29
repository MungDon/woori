package day0229.interface4;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	
	
	@Override
	public void buy() {
		System.out.println("구매 하기");
	}

	@Override
	//두 인터페이스 에서 이름이 같은 디폴트 메서드 오버라이딩
	public void order() {
		System.out.println("고객 판매주문");
	}


}
