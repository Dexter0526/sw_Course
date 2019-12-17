package com.exam.dao;

import org.apache.ibatis.session.SqlSession;

import com.exam.dao.mapper.UserMapper;
import com.exam.vo.User;

public class UserDao {

	private static UserDao instance = new UserDao();

	public static UserDao getInstance() {
		return instance;
	}

	private UserDao() {}
	
	
	public void add(User user) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			mapper.add(user);
			sqlSession.commit();
		}
	}
	
	public User get(String id) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			return sqlSession.getMapper(UserMapper.class).get(id);
		}
	}
	
	public void deleteAll() {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			sqlSession.getMapper(UserMapper.class).deleteAll();
			sqlSession.commit();
		}
	}
	
	public int getCount() {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			return sqlSession.getMapper(UserMapper.class).getCount();
		}
	}
	
}




