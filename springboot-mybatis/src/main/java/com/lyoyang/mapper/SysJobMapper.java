package com.lyoyang.mapper;

import com.lyoyang.entity.SysJob;
import com.lyoyang.entity.SysJobExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysJobMapper {
    int countByExample(SysJobExample example);

    int deleteByExample(SysJobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    List<SysJob> selectByExample(SysJobExample example);

    SysJob selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByExample(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}