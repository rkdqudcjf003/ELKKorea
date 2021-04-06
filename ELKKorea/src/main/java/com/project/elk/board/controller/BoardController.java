package com.project.elk.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.service.BoardService;

@RestController
@RequestMapping("/api")
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping(value = "/board")
	public List<BoardVO> boardList() throws Exception {

//		List<BoardVO> list = null;
//		list = boardService.boardList(boardVo);
//		return gson.toJson(list);
		return boardService.boardList();
	}

	@GetMapping(value = "/board/{boardIdx}")
	public BoardVO selectOneBoard(@PathVariable("boardIdx") int boardIdx) throws Exception {
		return boardService.selectOneBoard(boardIdx);
	}

	@PostMapping(value = "/board")
	public BoardVO insertBoard(@RequestBody BoardVO boardVo) throws Exception {
		return boardService.insertBoard(boardVo);
		
	}

//	@PutMapping(value = "/board/{boardIdx}")
//	public String updateBoard(@PathVariable("boardIdx") int boardIdx, BoardVO boardVo) throws Exception {
//		boardService.updateBoard(boardVo);
//	}
}
