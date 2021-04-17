package com.project.elk.board.service;

import java.util.List;

import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.domain.Search;

public interface BoardService {

	public List<BoardVO> getBoardList();

	public BoardVO selectOneBoard(int boardIdx);

	public int insertBoard(BoardVO boardVo);

	public int updateBoard(int boardIdx, BoardVO boardVo);

//	public void deleteBoard(int boardIdx, BoardVO boardVo);
	
	public int getBoardListCnt(Search search);

}
