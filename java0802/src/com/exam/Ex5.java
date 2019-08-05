package com.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex5 {

	public static void main(String[] args) {
		// Map
		Map<String, Puppy> puppyMap = new HashMap<>();
		
		puppyMap.put("푸들", new Puppy(2));
		puppyMap.put("포메", new Puppy(5));
		puppyMap.put("진돗개", new Puppy(7));
		
		Puppy p1 = puppyMap.get("푸들");
		
		puppyMap.put("푸들", new Puppy(3)); // 수정
		
		Set<String> keySet = puppyMap.keySet();
		System.out.println(keySet);
		
		for (String key : keySet) {
			System.out.println(key);
			
			Puppy p = puppyMap.get(key);
			p.speak();
		}
		
		System.out.println("===============");
		
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			
			Puppy p = puppyMap.get(key);
			p.speak();
		}
		
		
		System.out.println(puppyMap.size()); // 요소개수 3

		puppyMap.remove("진돗개");
		
		System.out.println(puppyMap);
		System.out.println(puppyMap.size()); // 요소개수 2
	} // main method

}
