package com.exam;

public class Ex4 {

	public static void main(String[] args) {
		// String 객체생성 = 불변객체(객체 내용이 변하지 않음)
		String str = "Java Programming";
		
		// String 메소드
		System.out.println(str.length());
		
//		str = null;
		// 문자열 비교
		if ("Java Programming".equals(str)) {
			System.out.println("문자열 같음");
		}
		
		// 문자열 가져오기. 인덱스번호 0부터 시작함.
		System.out.println(str.charAt(5)); // P
		System.out.println(str.substring(5)); // Programming
		System.out.println(str.substring(5, 8)); // Pro
		System.out.println("문자열 연결: "+str.concat("!!!"));
		System.out.println("문자열 교체: "+str.replace("Java", "JSP"));
		System.out.println("문자위치: "+str.indexOf('a')); // 1
		System.out.println("문자열위치: "+str.indexOf("gram")); // 8
		System.out.println("문자열위치: "+str.lastIndexOf("a")); // 10
		System.out.println("문자열 포함여부: " + str.contains("grem")); // false
		System.out.println("대문자 변환: "+str.toUpperCase());
		System.out.println("소문자 변환: "+str.toLowerCase());
		
		String[] strArr = str.split(" "); // 문자열 분리해서 배열로 리턴
		System.out.println("문자열 분리: "+strArr[0]);
		
		
		// 주민번호 -> 남여구분 1,3 남   2,4 여
		String ju = "951220-4234567";

//		int index = ju.indexOf('-');
		// 성별구분문자 가져오기. charAt()  substring()
//		char ch = ju.charAt(index + 1);
		
		char ch = ju.charAt(ju.indexOf('-') + 1);
		
		String s = ju.substring(7, 8);
		
		// if 비교  char ==     String  .equals()
		// 남여 출력
		if (ch == '1' || ch == '3') {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
		
		if (s.equals("1") || s.equals("3")) {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
		
		
	} // main method

}
