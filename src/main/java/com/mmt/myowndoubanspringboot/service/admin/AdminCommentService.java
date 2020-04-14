package com.mmt.myowndoubanspringboot.service.admin;

import com.mmt.myowndoubanspringboot.mapper.CommentMapper;
import com.mmt.myowndoubanspringboot.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AdminCommentService {
    @Autowired
    CommentMapper commentMapper;

    public Integer addComment(Comment comment) {
        comment.setCreateTime(new Date());
        return commentMapper.insertSelective(comment);
    }
}
