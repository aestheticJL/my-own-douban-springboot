package com.mmt.myowndoubanspringboot.mapper;

import com.mmt.myowndoubanspringboot.model.Comment;
import com.mmt.myowndoubanspringboot.model.CommentExample;
import java.util.List;

import com.mmt.myowndoubanspringboot.model.Movie;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);

    Comment getCommentByMid(Integer mid);

    List<Integer> getNewCommentMovieId();

    List<Integer> getMyHighScoreMovieId();
}