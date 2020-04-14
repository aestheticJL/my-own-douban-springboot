package com.mmt.myowndoubanspringboot.service.home;

import com.mmt.myowndoubanspringboot.mapper.CommentMapper;
import com.mmt.myowndoubanspringboot.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeCommentService {
    @Autowired
    CommentMapper commentMapper;
    public Comment getCommentByMid(Integer mid) {
        return commentMapper.getCommentByMid(mid);
    }
}
