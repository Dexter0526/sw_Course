package com.pgm.mongo_pro01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pgm.mongo_pro01.dao.MongoDao;
import com.pgm.mongo_pro01.dto.BoardVO;

@Service
public class MongoServiceImpl implements MongoService {

	@Override
	public void insert(BoardVO vo) {
		// TODO Auto-generated method stub
		MongoDao.getInstance().insert(vo);
	}
	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return MongoDao.getInstance().find();
	}
	@Override
	public BoardVO getBoard(double bno) {
		// TODO Auto-generated method stub
		return MongoDao.getInstance().findOne(bno);
	}
	@Override
	public void update(BoardVO vo) {
		// TODO Auto-generated method stub
		MongoDao.getInstance().update(vo);
	}
	@Override
	public void delete(double bno) {
		// TODO Auto-generated method stub
		MongoDao.getInstance().delete(bno);
	}

}
