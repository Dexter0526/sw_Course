package com.exam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.exam.dao.DBManager;
import com.exam.dao.mapper.BoardMapper;
import com.exam.vo.BoardVO;

import junit.framework.TestCase;

public class listTest extends TestCase {
	
	@Test
	public void getBoards(int startRow, int pageSize, String search){
		// Connection 가져오기
		SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession();
		// 인터페이스를 구현한 Mapper 프록시 객체를 만들어서 리턴함
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		List<BoardVO> boardList = mapper.getBoards(1, 10, "");

		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
		
	}
}
