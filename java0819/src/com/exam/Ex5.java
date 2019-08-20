package com.exam;

import java.sql.SQLException;

public class Ex5 {
	
	public void methodA() throws Exception {
		System.out.println("methodA 시작");
		methodB();
		System.out.println("methodA 종료");
	}
	
	public void methodB() throws Exception {
		System.out.println("methodB 시작");
//		try {
			// 직접 예외처리하는 방식
			methodC();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("methodB 종료");
	}
	
	//public abstract void methodD() throws Exception;
	
	public void methodC() throws ClassNotFoundException, SQLException, Exception {
		System.out.println("methodC 시작");
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		System.out.println("methodC 종료");
	}

	public static void main(String[] args) {
		Ex5 ex = new Ex5();
		try {
			ex.methodA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main method

}
