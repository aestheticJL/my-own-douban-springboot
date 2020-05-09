package com.mmt.myowndoubanspringboot.service.home;

import com.mmt.myowndoubanspringboot.mapper.CommentMapper;
import com.mmt.myowndoubanspringboot.model.Comment;
import com.mmt.myowndoubanspringboot.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeCommentService {
    @Autowired
    CommentMapper commentMapper;
    public Comment getCommentByMid(Integer mid) {
        return commentMapper.getCommentByMid(mid);
    }

}
