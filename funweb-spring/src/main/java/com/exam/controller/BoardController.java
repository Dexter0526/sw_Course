package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.exam.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
}
