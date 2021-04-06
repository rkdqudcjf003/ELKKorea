package com.project.elk.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> boardList() {
		return boardMapper.boardList();
	}

	@Override
	public BoardVO selectOneBoard(int boardIdx) {
		return boardMapper.selectOneBoard(boardIdx);

	}

	@Override
	public BoardVO insertBoard(BoardVO boardVo) {
		return boardMapper.insertBoard(boardVo);

	}

//	@Override
//	public void updateBoard(BoardVO boardVo) {
//		boardMapper.updateBoard(boardVo);
//
//	}
}
