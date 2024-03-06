package day0306.arraylists;

import java.util.ArrayList;

public class ArrayListEx04 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<=10; i++) {
				list.add(i);
				System.out.println(list.get(list.size()-1));
		}
	
//		String listAll = list.toString();
//		System.out.println(listAll);
	}
}
