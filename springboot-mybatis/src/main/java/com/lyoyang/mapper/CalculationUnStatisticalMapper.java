package com.lyoyang.mapper;

import com.lyoyang.entity.CalculationUnStatistical;
import com.lyoyang.entity.CalculationUnStatisticalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CalculationUnStatisticalMapper {
    int countByExample(CalculationUnStatisticalExample example);

    int deleteByExample(CalculationUnStatisticalExample example);

    int deleteByPrimaryKey(String transId);

    int insert(CalculationUnStatistical record);

    int insertSelective(CalculationUnStatistical record);

    List<CalculationUnStatistical> selectByExample(CalculationUnStatisticalExample example);

    CalculationUnStatistical selectByPrimaryKey(String transId);

    int updateByExampleSelective(@Param("record") CalculationUnStatistical record, @Param("example") CalculationUnStatisticalExample example);

    int updateByExample(@Param("record") CalculationUnStatistical record, @Param("example") CalculationUnStatisticalExample example);

    int updateByPrimaryKeySelective(CalculationUnStatistical record);

    int updateByPrimaryKey(CalculationUnStatistical record);
}