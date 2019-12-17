package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.domain.ReplyVO;
import com.exam.mapper.ReplyMapper;

import lombok.extern.log4j.Log4j;

@Service
@Transactional
@Log4j
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyMapper replyMapper;

	@Override
	public int register(ReplyVO replyVO) {
		log.info("register : " + replyVO);
		
		int insertCount = replyMapper.insert(replyVO);
		return insertCount;
	}

	@Override
	public ReplyVO get(int rno) {
		return replyMapper.read(rno);
	}

	@Override
	public int modify(ReplyVO replyVO) {
		return replyMapper.update(replyVO);
	}

	@Override
	public int remove(int rno) {
		return replyMapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(int bno) {
		return replyMapper.getList(bno);
	}

}
