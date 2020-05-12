package com.lyoyang.mapper;

import com.lyoyang.entity.AccountIsam;
import com.lyoyang.entity.AccountIsamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountIsamMapper {
    int countByExample(AccountIsamExample example);

    int deleteByExample(AccountIsamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountIsam record);

    int insertSelective(AccountIsam record);

    List<AccountIsam> selectByExample(AccountIsamExample example);

    AccountIsam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountIsam record, @Param("example") AccountIsamExample example);

    int updateByExample(@Param("record") AccountIsam record, @Param("example") AccountIsamExample example);

    int updateByPrimaryKeySelective(AccountIsam record);

    int updateByPrimaryKey(AccountIsam record);
}