package day0306.sets;

import java.util.HashSet;
import java.util.Set;

public class SetEx03 {
	public static void main(String[] args) {
		Object[] objarr = {"1", new Integer(1), "2", "2", "3", "4", 4, "4"};
		Set set =	new HashSet();
		
		for(int i = 0; i < objarr.length; i++) {
			set.add(objarr[i]);
		}
		System.out.println(set);
		
		for(Object arr : objarr) {
			set.add(arr);
		}
		System.out.println(set);
	}
}
