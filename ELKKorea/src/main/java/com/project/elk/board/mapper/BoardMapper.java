package com.project.elk.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.domain.Search;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getBoardList();

	public int getBoardListCnt(Search search);

	public BoardVO selectOneBoard(int boardIdx);

	public int insertBoard(BoardVO boardVo);

	public int updateBoard(int boardIdx, BoardVO boardVo);

	public BoardVO findByIdx(int boardIdx);




}
