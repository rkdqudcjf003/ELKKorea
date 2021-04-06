package com.project.elk.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.elk.board.domain.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> boardList();

	public BoardVO selectOneBoard(int boardIdx);

	public BoardVO insertBoard(BoardVO boardVo);

//	public void updateBoard(BoardVO boardVo);

}
