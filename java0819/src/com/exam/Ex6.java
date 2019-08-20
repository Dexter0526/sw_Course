package com.exam;

public class Ex6 {

	public void methodA(int num) throws Exception {
		// 매개변수 num이 음수면 정상동작 불가능한 로직
//		if (num < 0) {
//			System.out.println("num이 음수입니다.");
//			return;
//		}
		
		// num이 음수일때 예외를 인위적으로 발생시키기
		if (num < 0) {
			throw new Exception("num값이 음수입니다.");
		}
		
		System.out.println("num = " + num);
	}
	
	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");
		
		Ex6 ex = new Ex6();
		try {
			ex.methodA(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("=== 프로그램 정상종료 ===");
	} // main method

}
