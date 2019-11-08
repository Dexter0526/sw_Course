package com.exam.controller;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.domain.BoardVO;
import com.exam.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/write")
	public String write() {
		log.info("write() 호출됨...");
		log.warn("주의 메시지");
		return "center/write";
	}

	@PostMapping("/write")
	public String write(BoardVO boardVO, HttpServletRequest request) {

		// IP주소 값 저장
		boardVO.setIp(request.getRemoteAddr());

		// 게시글 번호 생성하는 메소드 호출
		int num = boardService.nextBoardNum();
		// 생성된 번호를 자바빈 글번호 필드에 설정
		boardVO.setNum(num);
		boardVO.setReadcount(0); // 조회수 0

		// 주글일 경우
		boardVO.setReRef(num); // [글그룹번호]는 글번호와 동일함
		boardVO.setReLev(0); // [들여쓰기 레벨] 0
		boardVO.setReSeq(0); // [글그룹 안에서의 순서] 0

		// 게시글 한개 등록하는 메소드 호출 insertBoard(boardVO)
		boardService.insertBoard(boardVO);

		return "redirect:/board/list";
	}

}
