package day0308;

import java.util.HashSet;
import java.util.Scanner;

/*
 	2. Set 계열의 클래스를 이용하여 로또번호를 랜덤메서드를 이용하여 생성하고  
List계열의 클래스를 이용하여 정렬하여 출력하는 로또구매 프로그램을 작성하시오.
- 금액을 입력받아 금액만큼 로또 번호 생성 (금액 1000원 단위 ~100000)
[출력]
로또 구매 금액 : 10000원
로또 번호 5회 출력
번호1 : [10,12,21,34,35,41]
번호2 : [11,18,28,30,33,43]
번호3 : [14,20,25,31,38,44]
번호4 : [8,11,24,39,36,41]
번호5 : [3,13,29,32,35,40]
 */
public class Test {
	Scanner sc  = new Scanner(System.in);
	
	//메뉴 메서드
	public void lottoMenu() {
		System.out.println("LOTTO 구입 프로그램");
		System.out.println("============");
		System.out.println("1. Lotto 구입");
		System.out.println("============");
		System.out.println("2. 종료");
		System.out.println("============");
	}
	// 시작 메서드
	public void store() {
		while(true) {
			
			lottoMenu();
			
			System.out.print("메뉴 선택 : ");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				buyLotto();
			}else if(choice == 2) {
				System.out.println("프로그램 종료.");
				System.exit(0);
			}else {
				System.out.println("1 또는 2 를 입력하세요");
				System.err.println();
			}
		}
	}
	// 로또 구매 메서드 호출
	public void buyLotto() {
		System.out.println("금액 입력");
		int money = Integer.parseInt(sc.nextLine());
		if(money<1000) {
			System.out.println("1000원 이상 입력하시오");
			System.out.println();
			return;
		}else if(money > 100000) {
			System.out.println("100000만원 이하로 입력하시오");
			System.out.println();
			return;
		}
		newLottoNum(money);
	}
	
	public void newLottoNum(int money) {
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		int count = money/1000;
		System.out.println();
		System.out.println("로또 번호 ["+count+"]회 출력");
		for(int i = 0; i<count; i++) {
			while(lottoSet.size()<6) {
			lottoSet.add((int)((Math.random()*45)+1));
			}
			System.out.println("로또 번호 "+lottoSet);
			lottoSet.clear();
		}
		System.out.println();
		System.out.println("===부자되세요===");
//		System.exit(0);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.store();
	}
}
