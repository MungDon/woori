package day0306.arraylists;

import java.util.ArrayList;

class Data{}

public class ArrayListEx01 {
	public static void main(String[] args) {
		// 객체 생성
		ArrayList list = new ArrayList();
		System.out.println(list);

		// .add() 값을 넣는 메서드
		list.add(100);
		list.add("hello");
		System.out.println(list);	// 순서유지
		
		list.add(100);
		list.add("hello");
		System.out.println(list); 	// 중복허용
		
		Data data = new Data();
		list.add(data);
		System.out.println(list);	// 들어가는 요소의 타입이 상관없다
		
		list.add(0, 77);				// add(index, 값) : 지정한 인덱스에 설정한 값을 넣겠다라는 뜻
		System.out.println(list);	// 추가되면서 한칸씩 밀림
		
		list.set(0, 700);				// set(index, 값)  : 지정한 인덱스에 설정한 값으로 수정하겠다라는 뜻
		System.out.println(list);	// 지정한 인덱스값에 설정한 값이 대입
		
		// .size()  :  저장된 데이터의 수를 구하는 메서드
		System.out.println(list.size());
		
		// .get(index 번호) : 지정된 인덱스의 값을 리턴해줌
		System.out.println(list.get(0));
//		System.out.println(list.get(10));
		
		// .remove(index 번호) : 지정된 index 의 값을 삭제함
		list.remove(0);
		System.out.println(list);
		
		// .clear() : 전체삭제
		list.clear();
		System.out.println(list);
		
	}
}
