package com.mmt.myowndoubanspringboot.mapper;

import com.mmt.myowndoubanspringboot.model.MovieWriter;
import com.mmt.myowndoubanspringboot.model.MovieWriterExample;
import java.util.List;

import com.mmt.myowndoubanspringboot.model.Writer;
import org.apache.ibatis.annotations.Param;

public interface MovieWriterMapper {
    long countByExample(MovieWriterExample example);

    int deleteByExample(MovieWriterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MovieWriter record);

    int insertSelective(MovieWriter record);

    List<MovieWriter> selectByExample(MovieWriterExample example);

    MovieWriter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MovieWriter record, @Param("example") MovieWriterExample example);

    int updateByExample(@Param("record") MovieWriter record, @Param("example") MovieWriterExample example);

    int updateByPrimaryKeySelective(MovieWriter record);

    int updateByPrimaryKey(MovieWriter record);

    int addMW(@Param("mid") Integer mid, @Param("writers") List<Writer> writers);
}