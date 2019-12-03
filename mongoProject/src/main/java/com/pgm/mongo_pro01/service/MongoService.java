package com.pgm.mongo_pro01.service;

import java.util.List;

import com.pgm.mongo_pro01.dto.BoardVO;

public interface MongoService {
	public void insert(BoardVO vo);
	public List<BoardVO> getList();
	public BoardVO getBoard(double bno);
	public void update(BoardVO vo);
	public void delete(double bno);

}
