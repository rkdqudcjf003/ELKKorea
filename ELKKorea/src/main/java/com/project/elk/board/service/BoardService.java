package com.project.elk.board.service;

import java.util.List;

import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.domain.Search;

public interface BoardService {
	public List<BoardVO> getBoardList(List<BoardVO> boardList);

//	public List<BoardVO> getBoardList(Search search);
	
	public int getBoardListCnt(Search search);

	public BoardVO selectOneBoard(int boardIdx);

	public int insertBoard(BoardVO boardVo);

	public int updateBoard(int boardIdx, BoardVO boardVo);


//	public void deleteBoard(int boardIdx, BoardVO boardVo);
	

}
