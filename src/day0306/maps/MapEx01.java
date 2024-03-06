package day0306.maps;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(33, "pw");
		hm.put(100, "java");
		System.out.println(hm);
		
		hm.put(100, "java");
		System.out.println(hm);
		
		System.out.println(hm.get(100));
		
		String sValue = hm.get(33);
		System.out.println(sValue);
	}

}
