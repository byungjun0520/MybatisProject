package com.global.biz.board;

import java.sql.SQLException;
import java.util.List;

import com.global.biz.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) throws SQLException {

		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		
		vo.setTitle("myBatis 제목");
		vo.setWriter("홍길동");
		vo.setContent("Mybatis 내용입니다.........");
	   // boardDAO.insertBoard(vo);
		vo.setSearchCondition("TITLE");
	    vo.setSearchKeyword("");
	    List<BoardVO> boardList = boardDAO.getBoardList(vo);
	    
	    for(BoardVO board : boardList) {
	    	System.out.println("====> "+board.toString());
	    }
	}

}
