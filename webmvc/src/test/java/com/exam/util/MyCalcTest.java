package com.exam.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
■ JUnit이 하나의 테스트 클래스를 가져와 테스트를 수행하는 방식
  ① 테스트 클래스에서 @Test가 붙은 public이고 void형이며 파라미터가 없는 테스트 메소드를 모두 찾는다.
  ② @BeforeClass가 붙은 스태틱 메소드가 있으면 실행한다.
  ③ 테스트 클래스의 오브젝트를 하나 만든다.
  ④ @Before가 붙은 메소드가 있으면 실행한다.
  ⑤ @Test가 붙은 메소드를 하나 호출하고 테스트 결과를 저장해둔다.
  ⑥ @After가 붙은 메소드가 있으면 실행한다.
  ⑦ 나머지 테스트 메소드에 대해 ③~⑥번을 반복한다.
  ⑧ @AfterClass가 붙은 스태틱 메소드가 있으면 실행한다.
  ⑨ 모든 테스트의 결과를 종합해서 돌려준다.
*/

public class MyCalcTest {
	
	// 픽스처 준비
	private MyCalc myCalc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
		
		myCalc = new MyCalc();
	}
	
	@Test
	public void testAdd() {
		System.out.println("@Test - testAdd()");
		
		int result = myCalc.add(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testIsOdd() {
		System.out.println("@Test - testIsOdd()");
		
		boolean result = myCalc.isOdd(3);
		assertTrue(result);
		
		assertFalse(myCalc.isOdd(2));
	}
	
	@Test
	public void testArray() {
		System.out.println("@Test - testArray()");
		
		int[] arrResult = myCalc.array(3);
		
		assertArrayEquals(new int[] { 1, 2, 3 }, arrResult);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

}
