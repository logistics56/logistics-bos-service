package com.logistics.module.crm.mapper;

import com.logistics.module.crm.model.TSmsSignup;
import com.logistics.module.crm.model.TSmsSignupExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSmsSignupMapper {
    int countByExample(TSmsSignupExample example);

    int insert(TSmsSignup record);

    int insertSelective(TSmsSignup record);

    List<TSmsSignup> selectByExample(TSmsSignupExample example);

    TSmsSignup selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TSmsSignup record, @Param("example") TSmsSignupExample example);

    int updateByExample(@Param("record") TSmsSignup record, @Param("example") TSmsSignupExample example);

    int updateByPrimaryKeySelective(TSmsSignup record);

    int updateByPrimaryKey(TSmsSignup record);
    
    List<TSmsSignup> queryByTime(@Param("startTime") Date startTime, @Param("endTime") Date endTime, @Param("telephone") String telephone, @Param("source") int source);
}