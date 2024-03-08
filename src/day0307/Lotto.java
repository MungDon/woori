package day0307;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Money {
	static long inputNum;	// 입력받을 금액을 저장할 변수

	public static void scanner() {	// 객체생성없이 가져다가 쓰기위해 static 으로 선언
		Scanner sc = new Scanner(System.in);
		try {
			inputNum = sc.nextLong();	// 금액을 long 타입으로 입력받음 / 문자입력시 예외 발생
		}catch(InputMismatchException e){	//예외가져와서 콘솔에 표시
			System.out.println("숫자만 입력해주세요");
		}
	}
}

public class Lotto {

	public static void main(String[] args) {
		int num = 0;			// 로또 한장 당 부여 받는 고유 번호 변수
		long count = 0;		// 로또 몇 회 출력 됐는지 알 수있는 변수
		
		System.out.println("금액을 입력해주세요 장 당 2000원입니다");

		while (true) {
			Money.scanner();	// Money 클래스의 scanner 메서드 호출 하여 입력 시작 
			
			// 구매금액이 적거나 많을경우 강제 예외 발생시키는 코드
			try {
				if ( Money.inputNum > 100000) {
					throw new Exception("인당 구매 금액 제한은 10만원입니다");
				}else if(Money.inputNum < 2000) {
					throw new Exception("금액이 적어 구매하지 못했습니다");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}    
			
			count = Money.inputNum/2000;	// 몇회 출력할지 입력받은 값에 따라 저장
			

			System.out.println("로또 구매 금액 : " + Money.inputNum + "원 " + " 잔돈 " + (Money.inputNum % 2000 + "원"));
			System.out.println("로또번호 "+count+"회 출력");
			
			for (int i = 2000; i < Money.inputNum; i += 2000) {
				num++;
				System.out.println("번호 " + num + lottoNum());
			}
			
			num = 0;
			System.out.println("로또 프로그램 종료");
			break;
		}

	}

	public static String lottoNum() {
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() != 6) {
			hs.add((int) ((Math.random() * 45) + 1));
		}
		List<Integer> list = new ArrayList<Integer>(hs);
		Collections.sort(list);
		return list.toString();
	}

}
