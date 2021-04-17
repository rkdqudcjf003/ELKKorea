package com.project.elk.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.domain.PagingUtil;
import com.project.elk.board.domain.Search;
import com.project.elk.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> getBoardList() {
		return boardMapper.getBoardList();
	}

	public int getBoardListCnt(Search search) {
		return boardMapper.getBoardListCnt(search);
	}

	@Override
	public BoardVO selectOneBoard(int boardIdx) {
		return boardMapper.selectOneBoard(boardIdx);

	}

	@Override
	public int insertBoard(BoardVO boardVo) {
		return boardMapper.insertBoard(boardVo);

	}

	@Override
	public int updateBoard(int boardIdx, BoardVO boardVo) {

		BoardVO board = boardMapper.findByIdx(boardIdx);
		board.setTitle(boardVo.getTitle());
		board.setWriter(boardVo.getWriter());
		board.setContent(boardVo.getContent());
		board.setCategory(boardVo.getCategory());
//		board.setUpdatedTime(new Date());

		return boardMapper.updateBoard(boardIdx, boardVo);

	}

}
