package com.lyoyang.springsecurity.mapper;

import com.lyoyang.springsecurity.entity.PersistentLogins;
import com.lyoyang.springsecurity.entity.PersistentLoginsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersistentLoginsMapper {
    int countByExample(PersistentLoginsExample example);

    int deleteByExample(PersistentLoginsExample example);

    int deleteByPrimaryKey(String series);

    int insert(PersistentLogins record);

    int insertSelective(PersistentLogins record);

    List<PersistentLogins> selectByExample(PersistentLoginsExample example);

    PersistentLogins selectByPrimaryKey(String series);

    int updateByExampleSelective(@Param("record") PersistentLogins record, @Param("example") PersistentLoginsExample example);

    int updateByExample(@Param("record") PersistentLogins record, @Param("example") PersistentLoginsExample example);

    int updateByPrimaryKeySelective(PersistentLogins record);

    int updateByPrimaryKey(PersistentLogins record);
}