package day0306.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx05 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(new Integer(10));	// list.add(10); 와 같지만 객체 활용
		list.add(new Integer(5));		// 1번째 index 에 5 대입 : 정확히는 Integer 의 주소가 대입
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list);
		
		list.subList(1, 4); // (시작, 미만)

		ArrayList list2 = new ArrayList(list.subList(1, 4));
		System.out.println(list);
		System.out.println(list2);
		
		// .sort()	: 정렬 기능(오름차순)
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		// 반대로 전환
		// 방법 1
//		Collections.reverse(list);
//		System.out.println(list);
//		Collections.reverse(list2);
//		System.out.println(list2);
		
		// 방법2
//		list.sort(Collections.reverseOrder());
//		list2.sort(Collections.reverseOrder());
//		System.out.println(list);
//		System.out.println(list2);
		
		// 방법3
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("list : "+list);
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println("list2 : "+list2);
		
		// .contains - true/false
		System.out.println("list가 0 을 가지고있는가? "+list.contains(0));
		System.out.println("list2가 9 을 가지고있는가? "+list2.contains(9));
		
		System.out.println("list가 list2의 모든 값을 가지고있는가? "+list.containsAll(list2));
		System.out.println("list2가 list의 모든 값을 가지고있는가? "+list2.containsAll(list));
		
		// .retainAll() : 교집합   
		list.retainAll(list2);
		System.out.println(list);
		System.out.println(list2);
	}
}
