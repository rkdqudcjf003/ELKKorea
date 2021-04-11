package com.project.elk.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.elk.member.domain.MemberVO;

@Service
public interface MemberService {

	List<MemberVO> memberList();

}
