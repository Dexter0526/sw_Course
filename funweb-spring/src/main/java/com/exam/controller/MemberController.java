package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	//@RequestMapping(value = "/join", method = RequestMethod.GET)
	@GetMapping("/join")
	public String join() {
		return "/member/join";
	}
	
}
