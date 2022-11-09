package com.study.board.mapper;

import com.study.board.domain.BoardDTO;
import com.study.board.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public int insertBoard(BoardDTO params);
    public BoardDTO selectBoardDetail(Long idx);
    public int updateBoard(BoardDTO params);
    public int deleteBoard(Long idx);
    public List<BoardDTO> selectBoardList(BoardDTO params);
    public int selectBoardTotalCount(BoardDTO params);

}
