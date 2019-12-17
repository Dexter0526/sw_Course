package com.exam.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import com.exam.vo.User;

import junit.framework.TestCase;

// TestCase 클래스 상속받는 방식은 애노테이션 기반이 아님.

// JUnit 단위테스트 수행순서
// 1) TestCase 객체 생성
// 2) setUp() 메소드 호출
// 3) TestCase 객체의 임의의 test메소드 호출
// 4) tearDown() 메소드 호출
// 5) TestCase 객체를 폐기
// 6) 위의 1~5 반복

public class UserDaoTest extends TestCase {

	// 픽스처(fixture)
	private UserDao dao;
	private User user1;
	private User user2;
	private User user3;
	
	@Override
	protected void setUp() throws Exception {
		// 테스트 수행전 준비작업 - 주로 픽스처(fixture)를 준비
		System.out.println("setUp 메소드 호출됨");
		
		this.dao = UserDao.getInstance();
		this.user1 = new User("gyumee", "박성철", "springno1");
		this.user2 = new User("leegw700", "이길원", "springno2");
		this.user3 = new User("bumjin", "박범진", "springno3");
	}

	@Override
	protected void tearDown() throws Exception {
		// 테스트 수행후 정리작업
		System.out.println("tearDown 메소드 호출됨");
	}

	public void testAddAndGet() {
		System.out.println("testAddAndGet 메소드 호출됨");
		
		dao.deleteAll();
		assertEquals(0, dao.getCount());
		

		dao.add(user1);
		dao.add(user2);
		assertEquals(2, dao.getCount());

		
		User userget1 = dao.get(user1.getId());
		assertEquals(user1.getName(), userget1.getName());
		assertEquals(user1.getPassword(), userget1.getPassword());
		
		User userget2 = dao.get(user2.getId());
		assertEquals(user2.getName(), userget2.getName());
		assertEquals(user2.getPassword(), userget2.getPassword());
	}
	
	
	public void testCount() {
		System.out.println("testCount 메소드 호출됨");
		
        dao.deleteAll();
        assertEquals(0, dao.getCount());
        
        dao.add(user1);
        assertEquals(1, dao.getCount());
        
        dao.add(user2);
        assertEquals(2, dao.getCount());

        dao.add(user3);
        assertEquals(3, dao.getCount());
	}
	

//	public static void main(String[] args) {
//		JUnitCore.main("com.exam.dao.UserDaoTest");
//	}

}
