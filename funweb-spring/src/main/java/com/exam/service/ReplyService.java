package com.exam.service;

import java.util.List;

import com.exam.domain.ReplyVO;

public interface ReplyService {

	public int register(ReplyVO replyVO);
	
	public ReplyVO get(int rno);
	
	public int modify(ReplyVO replyVO);
	
	public int remove(int rno);
	
	public List<ReplyVO> getList(int bno);
}
