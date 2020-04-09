package com.mmt.myowndoubanspringboot.mapper;

import com.mmt.myowndoubanspringboot.model.Director;
import com.mmt.myowndoubanspringboot.model.MovieDirector;
import com.mmt.myowndoubanspringboot.model.MovieDirectorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieDirectorMapper {
    long countByExample(MovieDirectorExample example);

    int deleteByExample(MovieDirectorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MovieDirector record);

    int insertSelective(MovieDirector record);

    List<MovieDirector> selectByExample(MovieDirectorExample example);

    MovieDirector selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MovieDirector record, @Param("example") MovieDirectorExample example);

    int updateByExample(@Param("record") MovieDirector record, @Param("example") MovieDirectorExample example);

    int updateByPrimaryKeySelective(MovieDirector record);

    int updateByPrimaryKey(MovieDirector record);

    int addMD(@Param("mid") Integer mid, @Param("directors") List<Director> directors);
}