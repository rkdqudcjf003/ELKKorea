package com.project.elk.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.elk.member.domain.MemberVO;

@Mapper
public interface MemberMapper {

	public List<MemberVO> memberList();
}
