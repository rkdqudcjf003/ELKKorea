package com.project.elk.board.service;

import java.util.List;

import com.project.elk.board.domain.BoardVO;


public interface BoardService {

	public List<BoardVO> boardList();

	public BoardVO selectOneBoard(int boardIdx);

	public BoardVO insertBoard(BoardVO boardVo);

	public void updateBoard(BoardVO boardVo);

}
