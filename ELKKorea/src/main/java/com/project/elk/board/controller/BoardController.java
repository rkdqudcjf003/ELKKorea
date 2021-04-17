package com.project.elk.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.elk.board.service.BoardService;
import com.project.elk.board.domain.BoardVO;
import com.project.elk.board.domain.PagingUtil;
import com.project.elk.board.domain.Search;

@RestController
@RequestMapping("/api")
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping(value = "/board/list")
	public List<BoardVO> boardList(Model model, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "1") int range,
			@RequestParam(required = false, defaultValue = "title") String searchType,
			@RequestParam(required = false) String keyword) throws Exception {
		Search search = new Search();
		search.setSearchType(searchType);
		search.setKeyword(keyword);

		// 전체 게시글 개수
		int boardListCnt = boardService.getBoardListCnt(search);
		search.pageInfo(page, range, boardListCnt);

		// PageDTO 객체생성
		PagingUtil PageDTO = new PagingUtil();
		PageDTO.pageInfo(page, range, boardListCnt);
		model.addAttribute("pagingData", search);
		List<BoardVO> boardList = boardService.getBoardList(search);

//		return boardService.getBoardList(boardList);
	}

	@GetMapping(value = "/board/read/{boardIdx}")
	public BoardVO selectOneBoard(@PathVariable("boardIdx") int boardIdx) throws Exception {
		return boardService.selectOneBoard(boardIdx);
	}

	@PostMapping(value = "/board/insert")
	public int insertBoard(@RequestBody BoardVO boardVo) throws Exception {
		return boardService.insertBoard(boardVo);

	}

	@PutMapping(value = "/board/{boardIdx}")
	public int updateBoard(@PathVariable("boardIdx") int boardIdx, BoardVO boardVo) throws Exception {
		return boardService.updateBoard(boardIdx, boardVo);
	}
}
