package day0306.arraylists;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//ArrayList<String> list = new ArrayList<String>();
		Date day = new Date();
		
		list.add("hello");
		list.add(100);	// <String> 으로 지정해줬을 경우 에러남
		list.add(day); // <String> 으로 지정해줬을 경우 에러남
		System.out.println(list);
		
		Object obj = list.get(0);		// 0번째의 값 꺼냄
								// public E get(int index)
								// E : Element 의 약자 , 모든타입을 의미
								// -> 모든타입을 받을 수 있는것 -> Object
		System.out.println(obj);
		
		String str = (String) list.get(0);

		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("world");
		String str2 = list2.get(0);
		System.out.println(str2);
		
	}
}