package com.exam.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.exam.vo.User;

public interface UserMapper {
	
	@Insert("insert into users(id, name, password) values(#{id}, #{name}, #{password})")
	public void add(User user);
	
	@Select("select * from users where id = #{id}")
	public User get(String id);
}
