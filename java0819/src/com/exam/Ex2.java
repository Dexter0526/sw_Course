package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");
		
		int a = 10, b = 2, result = 0;
		
		String str = "문자열";
		
		int[] arr = { 10, 20, 30 };
		
		try {
			result = a / b; // 0으로 나눔
			
			System.out.println("result : " + result);
			
			char ch = str.charAt(0); // null참조 사용
			
			System.out.println("arr[3] = " + arr[3]); // 잘못된 인덱스 사용
			
		} catch (ArithmeticException e) {
			System.out.println("수학연산관련 예외발생");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("null참조변수 사용 예외발생");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("런타임 예외발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
			System.out.println("예외발생여부 상관없이 정리작업");
			/*
			 입출력 객체 자원닫기 예시
			 rs.close();
			 pstmt.close();
			 con.close();
			 */
		}
		
		System.out.println("=== 프로그램 정상종료 ===");
	} // main method

}
