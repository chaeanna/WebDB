package com.study.board.mapper;


import com.study.board.domain.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    public int insertComment(CommentDTO params);
    public CommentDTO selectCommentDetail(Long idx);
    public int updateComment(CommentDTO params);
    public int deleteComment(Long idx);
    public List<CommentDTO> selectCommentList(CommentDTO params);
    public int selectCommentTotalCount(CommentDTO params);

}

