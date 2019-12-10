package com.exam.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import com.exam.vo.User;

public class UserDaoTest {

	@Test
	public void addAndGet() {
		UserDao dao = UserDao.getInstance();

		User user = new User();
		user.setId("gyumee3");
		user.setName("박성철");
		user.setPassword("springno1");

		dao.add(user);

		
		User user2 = dao.get(user.getId());
		
		assertThat(user2.getName(), is(user.getName()));
		assertThat(user2.getPassword(), is(user.getPassword()));
	}

//	public static void main(String[] args) {
//		JUnitCore.main("com.exam.dao.UserDaoTest");
//	}

}
