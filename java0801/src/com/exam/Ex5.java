package com.exam;

import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) {
		String str = "Java";
		str += "Programming";
		
		// StringBuffer : 가변크기의 버퍼를 가짐.
		//     객체 자신의 문자열값 수정 가능.
		StringBuffer sb = new StringBuffer();
		sb.append("Java"); // 뒷부분에 추가
		System.out.println(sb.toString());
		sb.append(" Programming");
		System.out.println(sb);
		
		sb.replace(0, 4, "JSP");
		System.out.println(sb);// JSP Programming
		
		sb.insert(3, ",");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("=================");
		
		// StringTokenizer : 문자열을 분리하기 위해 사용.
		//   String클래스의 split() 메소드와 동일한 기능.
		
		String strFruits = "사과#배#감#포도";
		
		StringTokenizer st = new StringTokenizer(strFruits, "#");
		// 토큰(Token)
		// 구분문자(Delimeter)
		
		System.out.println(st.countTokens()); // 토큰개수: 4
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println(st.countTokens()); // 토큰개수: 0
		
		
		System.out.println("===========");
		
		String query = "name=gildong&addr=busan&age=27";
		
		// &, = 모두 구분문자가 됨.
		StringTokenizer st2 = new StringTokenizer(query, "&=");
		System.out.println(st2.countTokens());
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
	} // main method

}
