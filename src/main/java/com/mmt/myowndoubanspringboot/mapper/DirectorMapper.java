package com.mmt.myowndoubanspringboot.mapper;

import com.mmt.myowndoubanspringboot.model.Director;
import com.mmt.myowndoubanspringboot.model.DirectorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectorMapper {
    long countByExample(DirectorExample example);

    int deleteByExample(DirectorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Director record);

    int insertSelective(Director record);

    List<Director> selectByExample(DirectorExample example);

    Director selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByExample(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByPrimaryKeySelective(Director record);

    int updateByPrimaryKey(Director record);

    int addDirectors(@Param("directors") List<Director> directors);
}