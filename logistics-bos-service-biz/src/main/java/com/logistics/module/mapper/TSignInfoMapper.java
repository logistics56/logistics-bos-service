package com.logistics.module.mapper;

import com.logistics.module.model.TSignInfo;
import com.logistics.module.model.TSignInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSignInfoMapper {
    int countByExample(TSignInfoExample example);

    int insert(TSignInfo record);

    int insertSelective(TSignInfo record);

    List<TSignInfo> selectByExample(TSignInfoExample example);

    TSignInfo selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TSignInfo record, @Param("example") TSignInfoExample example);

    int updateByExample(@Param("record") TSignInfo record, @Param("example") TSignInfoExample example);

    int updateByPrimaryKeySelective(TSignInfo record);

    int updateByPrimaryKey(TSignInfo record);
}