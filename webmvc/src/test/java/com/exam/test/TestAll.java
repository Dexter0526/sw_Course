package com.exam.test;

import org.junit.runner.JUnitCore;

import com.exam.dao.UserDaoTest;
import com.exam.util.MyCalcTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("All test");
		
		suite.addTestSuite(UserDaoTest.class);
		suite.addTest(new TestSuite(MyCalcTest.class));
		
		// 테스트케이스 클래스 개수
		System.out.println("testCount() : " + suite.testCount());
		
		// 테스트 메소드 개수
		System.out.println("countTestCases() : " + suite.countTestCases());
		
		return suite;
	}
	
	public static void main(String[] args) {
		JUnitCore.main("com.exam.test.TestAll");
	}
	
	
}
