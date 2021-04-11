package com.project.elk.member.controller;

import java.lang.reflect.Member;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elk.member.domain.MemberVO;
import com.project.elk.member.service.MemberService;

@RestController
@RequestMapping("/api")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	public static final Logger logger
	=LoggerFactory.getLogger(MemberController.class);
	
	@GetMapping("/member/list")
	public List<MemberVO> memberList() throws Exception
	{
		//멤버 리스트 화면 보여주기
		logger.info("맴버리스트 보여주기");
		List<MemberVO> list = memberService.memberList();
		//멤버 리스트 결과 보여주기
		logger.info("memberList, list.size={}", list.size());
		return list;
	}
}
