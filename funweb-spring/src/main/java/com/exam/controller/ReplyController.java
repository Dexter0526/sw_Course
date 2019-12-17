package com.exam.controller;

import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	
	@GetMapping(value = "/pages/{bno}/", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<ReplyVO>>  getList(@PathVariable("bno") int bno) {
		
		List<ReplyVO> replyList = replyService.getList(bno);
		
		return new ResponseEntity<List<ReplyVO>>(replyList, HttpStatus.OK);
	}
	
	
	
	
	
}
