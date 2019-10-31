package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.exam.dao.mapper.AttachMapper;
import com.exam.vo.AttachVO;

public class AttachDao {
	
	private static AttachDao instance = new AttachDao();

	public static AttachDao getInstance() {
		return instance;
	}

	private AttachDao() {}
	
	
	// 첨부파일정보 입력하기 메소드
	public void insertAttach(AttachVO attachVO) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			AttachMapper mapper = sqlSession.getMapper(AttachMapper.class);
			mapper.insertAttach(attachVO);
			sqlSession.commit();
		}
	} // insertAttach method
	
	
	// 글번호에 해당하는 첨부파일정보 가져오기
	public List<AttachVO> getAttaches(int bno) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			return sqlSession.getMapper(AttachMapper.class).getAttaches(bno);
		}
	} // getAttach method
	
	
	// 게시판 글번호에 해당하는 첨부파일정보 삭제하는 메소드
	public void deleteAttach(int bno) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			sqlSession.getMapper(AttachMapper.class).deleteAttachByBno(bno);
			sqlSession.commit();
		}
	} // deleteAttach method
	
	
	// uuid에 해당하는 첨부파일정보 한개 삭제하는 메소드
	public void deleteAttach(String uuid) {
		try (SqlSession sqlSession = DBManager.getSqlSessionFactory().openSession()) {
			sqlSession.getMapper(AttachMapper.class).deleteAttachByUuid(uuid);
			sqlSession.commit();
		}
	} // deleteAttach method
	
}
