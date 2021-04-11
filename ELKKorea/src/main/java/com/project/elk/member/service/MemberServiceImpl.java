package com.project.elk.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.elk.member.domain.MemberVO;
import com.project.elk.member.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public List<MemberVO> memberList() {
		return memberMapper.memberList();
	}

}
