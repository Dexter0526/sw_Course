package com.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.exam.domain.ReplyVO;

public interface ReplyMapper {
	
	@Insert("INSERT INTO reply (bno, reply, replyer) "
			+ "VALUES (#{bno}, #{reply}, #{replyer})")
	public int insert(ReplyVO replyVO); 
	
	
	@Select("SELECT * FROM reply WHERE rno = #{rno}")
	public ReplyVO read(int rno);
	
	
	@Delete("DELETE FROM reply WHERE rno = #{rno}")
	public int delete(int rno);
	
	
	@Update("UPDATE reply "
			+ "SET reply = #{reply}, updatedate = CURRENT_TIMESTAMP "
			+ "WHERE rno = #{rno} ")
	public int update(ReplyVO replyVO);
	
	
	@Select("SELECT * FROM reply WHERE bno = #{bno} ORDER BY rno ASC")
	public List<ReplyVO> getList(@Param("bno") int bno);
	
}
