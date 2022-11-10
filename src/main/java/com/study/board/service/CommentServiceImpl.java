package com.study.board.service;

import com.study.board.domain.CommentDTO;
import com.study.board.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public boolean registerComment(CommentDTO params) {
        int queryResult = 0;

        if (params.getIdx() == null) {
            queryResult = commentMapper.insertComment(params);
        } else {
            queryResult = commentMapper.updateComment(params);
        }
        return (queryResult == 1) ? true : false;
    }

    @Override
    public boolean deleteComment(Long idx) {
        int queryResult = 0;
        System.out.println(idx);

        CommentDTO comment = commentMapper.selectCommentDetail(idx) ;
        System.out.println(comment.getDeleteYn());

        if (comment != null && "N".equals(comment.getDeleteYn())) {
            queryResult = commentMapper.deleteComment(idx);
            System.out.println(queryResult);
        }
            return (queryResult == 1) ? true : false;
        }

        @Override
        public List<CommentDTO> getCommentList(CommentDTO params) {
            List<CommentDTO> commentList = Collections.emptyList();
            int commentTotalCount = commentMapper.selectCommentTotalCount(params) ;
            if (commentTotalCount > 6) {
                commentList = commentMapper.selectCommentList(params);
            }
                return commentList;
        }
}
