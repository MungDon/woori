package day0307;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx04 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("java", 85);
		map.put("jsp", 90);
		map.put("html", 80);
		map.put("spring", 95);
		
		Integer value1 = map.get("java");
		System.out.println("key java 의 value 는 "+value1);
		
		// 키 Set 컬렉션을 얻고, 반복 - 키, 값을 꺼냄
		Set<String> keySet = map.keySet();	
		Iterator<String> kIter = keySet.iterator();	// 
		while (kIter.hasNext()) {
			String key = kIter.next();
			Integer value2 = map.get(key);
			System.out.println("따로뽑기 : "+key + "=" + value2);
		}
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		System.out.println("Entry : "+entry);
		
		Iterator<Entry<String, Integer>> eIter = entry.iterator();
		
		while(eIter.hasNext()) {
			Map.Entry<String, Integer> map2 = eIter.next();
			System.out.println("Map으로 변환 : "+map2);
		}
		
		map.remove("java");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);

	}

}
