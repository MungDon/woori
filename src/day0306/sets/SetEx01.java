package day0306.sets;

import java.util.Date;
import java.util.HashSet;

class Test{
}

public class SetEx01 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		// .add() : 값 넣기
		hs.add(100);
		hs.add("hello");
		hs.add(7);
		Date d = new Date();
		Date d2 = new Date();
		
		hs.add(d);
		hs.add(d2);
		hs.add(new Date());
		hs.add(7);
		hs.add(7);
		
		System.out.println(hs); // 순서없음 중복값 허용안함
		
		// 객체 생성 -> 주소가 다다르기 때문에 값이 들어감
		hs.add(new Test());
		hs.add(new Test());
		hs.add(new Test());
		System.out.println(hs);
	}

}
