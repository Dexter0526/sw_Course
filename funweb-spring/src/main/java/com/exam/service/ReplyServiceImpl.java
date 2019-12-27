package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.domain.Criteria;
import com.exam.domain.ReplyPageDTO;
import com.exam.domain.ReplyVO;
import com.exam.mapper.BoardMapper;
import com.exam.mapper.ReplyMapper;

import lombok.extern.log4j.Log4j;

@Service
@Transactional
@Log4j
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyMapper replyMapper;
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public int register(ReplyVO replyVO) {
		log.info("register : " + replyVO);
		
		boardMapper.updateReplyCnt(replyVO.getBno(), 1);
		
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
		
		ReplyVO replyVO = replyMapper.read(rno);
		
		boardMapper.updateReplyCnt(replyVO.getBno(), -1);
		
		return replyMapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, int bno) {
		return replyMapper.getListWithPaging(cri, bno);
	}

	@Override
	public ReplyPageDTO getListPage(Criteria cri, int bno) {
		int replyCnt = replyMapper.getCountByBno(bno);
		List<ReplyVO> list = replyMapper.getListWithPaging(cri, bno);
		return new ReplyPageDTO(replyCnt, list);
	}

}
