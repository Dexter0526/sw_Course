package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// List 인터페이스 구현 -> ArrayList, Vector
		// : 가변크기 배열
		
		List list = new ArrayList();
		
		System.out.println(list.size()); // 요소 개수 0
		
		list.add(1); // 인덱스 0번째
		list.add("둘"); // 인덱스 1번째
		list.add(3.14); // 인덱스 2번째
		list.add(1, '사'); // 인덱스 1번째 위치에 '사'를 삽입
		
		System.out.println(list); // list.toString()
		
		list.remove(1); // 인덱스 1번위치 객체를 삭제
		System.out.println(list);
		
		System.out.println(list.contains(3.14)); // true
		
		
		list.clear();
		System.out.println(list.size()); // 요소 개수 0
		System.out.println(list);
		System.out.println(list.isEmpty()); // true
		

	} // main method

}
