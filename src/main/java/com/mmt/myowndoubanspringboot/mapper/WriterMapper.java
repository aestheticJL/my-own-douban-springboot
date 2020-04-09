package com.mmt.myowndoubanspringboot.mapper;

import com.mmt.myowndoubanspringboot.model.Writer;
import com.mmt.myowndoubanspringboot.model.WriterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WriterMapper {
    long countByExample(WriterExample example);

    int deleteByExample(WriterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Writer record);

    int insertSelective(Writer record);

    List<Writer> selectByExample(WriterExample example);

    Writer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Writer record, @Param("example") WriterExample example);

    int updateByExample(@Param("record") Writer record, @Param("example") WriterExample example);

    int updateByPrimaryKeySelective(Writer record);

    int updateByPrimaryKey(Writer record);

    int addWriters(@Param("writers") List<Writer> writers);
}