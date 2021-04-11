package com.project.elk.board.domain;

import lombok.Data;

@Data
public class BoardVO {
	private int boardIdx;
	private String title;
	private String content;
	private String writer;
	private String category;
	private int viewCnt;
	private String noticeYn;
	private String deleteYn;
}
	