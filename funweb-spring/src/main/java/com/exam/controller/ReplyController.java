package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.domain.ReplyVO;
import com.exam.service.ReplyService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/replies/*")
@Log4j
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	
	@PostMapping(value = "/new", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> create(@RequestBody ReplyVO replyVO) {
		
		log.info("replyVO : " + replyVO);
		
		int insertCount = replyService.register(replyVO);
		
		log.info("Reply INSERT COUNT: " + insertCount);
		
		ResponseEntity<String> entity = null;
		if (insertCount > 0) {
			entity = new ResponseEntity<String>("success", HttpStatus.OK);
		} else {
			entity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return entity;
	}
	
	
	@GetMapping(value = "/pages/{bno}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<ReplyVO>> getList(@PathVariable("bno") int bno) {
		
		List<ReplyVO> replyList = replyService.getList(bno);
		
		return new ResponseEntity<List<ReplyVO>>(replyList, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/{rno}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") int rno) {
		ReplyVO replyVO = replyService.get(rno);
		return new ResponseEntity<ReplyVO>(replyVO, HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{rno}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> remove(@PathVariable("rno") int rno) {
		
		int deleteCount = replyService.remove(rno);
		
		return deleteCount > 0 
				? new ResponseEntity<String>("success", HttpStatus.OK) 
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@RequestMapping(method = { RequestMethod.PUT, RequestMethod.PATCH },
			value = "/{rno}",
			consumes = "application/json")
	public ResponseEntity<String> modify(@RequestBody ReplyVO replyVO,
			@PathVariable("rno") int rno) {
		
		replyVO.setRno(rno);
		
		int updateCount = replyService.modify(replyVO);
		
		return updateCount > 0 
				? new ResponseEntity<String>("success", HttpStatus.OK) 
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}





