package day0306.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		//map 에 put 메서드로 key, value 값저장
		map.put("java", new Integer(100));	
		map.put("jsp", new Integer(70));
		map.put("web", new Integer(60));
		map.put("data", new Integer(90));
		System.out.println(map);		// 저장된 값들 출력

		Set set = map.entrySet();		// key 와 value 를 한 묶음으로 바꾸기

		System.out.println(set);		// 바뀐값 출력

		Iterator iter = set.iterator();	// set 을 iterator 객체로 생성
		

		while (iter.hasNext()) {	// 반복자로 꺼낼 값이 있을때까지 반복
												// 값 꺼내주기
			Map.Entry e = (Map.Entry) iter.next();	// Set 에서 한묶음이된 값들을 Map.Entry타입으로 변환하여 
																	// key 값과 value 값으로 다시 쪼개줌
			System.out.println(e); // == System.out.println(e.getKey+"="+e.getValue);
		}

		Set s = map.keySet();	// map 에 있는 key 값들만 모아서 s 에 저장
		System.out.println(s);	// 모은값 출력

		Collection<Integer> s2 = map.values(); // map 값중 value 들만 모아서 s2 에저장
		
		Iterator iter2 = s2.iterator();	// s2 를 iterator 객체로 생성
		
		int sum = 0;
		
		while (iter2.hasNext()) {	// 반복자로 꺼낼 값이 있을때까지 반복
			sum += (Integer) iter2.next();  // 꺼낸값들을 sum 에 더하고 저장
		}
		System.out.println("value 들의 총 합 : "+ sum); // 전부다 더한 값 출력
		sum /= s2.size();	// 더한값을 총 요소의 갯수로 나누기
		System.out.println("value 들의 평균 : "+sum);	// 나눈값 출력
	}
}
