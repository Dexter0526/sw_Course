package com.exam.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.exam.vo.BoardVO;

public interface BoardMapper {

	// insert할 레코드의 번호 생성 메소드
	public int nextBoardNum();
	
	// 게시글 한개 등록하는 메소드
	public void insertBoard(BoardVO boardVO);
	
	// 페이징으로 글목록 가져오기
	// 매개변수가 2개 이상일때는 @Param("설정값이름") 이름 설정하기
	public List<BoardVO> getBoards(@Param("startRow") int startRow, @Param("pageSize") int pageSize, @Param("search") String search);
	
	
	public int getBoardCount(String search);
	
	
	public void updateReadcount(int num);
	
	
	public BoardVO getBoard(int num);
	
	
	public int countByNumAndPasswd(int num, String passwd);
	
	
	
	
	
	
	
	
}
