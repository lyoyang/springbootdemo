package com.lyoyang.mapper;

import com.lyoyang.entity.ChannelFeeConfig;
import com.lyoyang.entity.ChannelFeeConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface ChannelFeeConfigMapper {
    int countByExample(ChannelFeeConfigExample example);

    int deleteByExample(ChannelFeeConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ChannelFeeConfig record);

    int insertSelective(ChannelFeeConfig record);

    List<ChannelFeeConfig> selectByExample(ChannelFeeConfigExample example);

    ChannelFeeConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ChannelFeeConfig record, @Param("example") ChannelFeeConfigExample example);

    int updateByExample(@Param("record") ChannelFeeConfig record, @Param("example") ChannelFeeConfigExample example);

    int updateByPrimaryKeySelective(ChannelFeeConfig record);

    int updateByPrimaryKey(ChannelFeeConfig record);

    List<ChannelFeeConfig> selectAvailabFeeConfig(Map<String, Object> paramMap);

    List<ChannelFeeConfig> selectAvailabFeeConfigByRouter(Map<String, Object> paramMap);

    int updateStatusById(ChannelFeeConfig updateConfig);

    Integer queryConditionCount(Map<String, Object> queryParam);

    List<ChannelFeeConfig> queryConditionPage(Map<String, Object> queryParam);
    //获取智能POS的渠道手续费配置
    List<ChannelFeeConfig> queryListForPos(Map<String, Object> paramMap);

    //获取外卡的渠道手续费配置
    List<ChannelFeeConfig> queryListForWildCard(Map<String, Object> paramMap);

    //获取恒信通银联扫码手续费配置
    List<ChannelFeeConfig> queryListByHXTYL(Map<String, Object> paramMap);

    //查询银联扫码清结算渠道手续费（不带卡类型）
    List<ChannelFeeConfig> selectAvailabFeeConfigForBYS(Map<String, Object> paramMap);

    List<ChannelFeeConfig> selectAvailabFeeConfigByRouterNoCardType(Map<String, Object> paramMap);
}