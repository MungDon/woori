package day0306.arraylists;

import java.util.ArrayList;

public class ArrayListEx02 {
	public static void main(String[] args) {
//		ArrayList list1 = new ArrayList();
//		ArrayList list2 = new ArrayList(20);
//		System.out.println(list1.size());
//		System.out.println(list2.size());
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		ArrayList list2 = new ArrayList(list1); // 기존의 list1 값 복사해서 생성
		System.out.println(list1);	
		System.out.println(list2);
		
		
	}
}
