package com.logistics.module.mapper;

import com.logistics.module.model.TFixedArea;
import com.logistics.module.model.TFixedAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFixedAreaMapper {
    int countByExample(TFixedAreaExample example);

    int insert(TFixedArea record);

    int insertSelective(TFixedArea record);

    List<TFixedArea> selectByExample(TFixedAreaExample example);

    TFixedArea selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TFixedArea record, @Param("example") TFixedAreaExample example);

    int updateByExample(@Param("record") TFixedArea record, @Param("example") TFixedAreaExample example);

    int updateByPrimaryKeySelective(TFixedArea record);

    int updateByPrimaryKey(TFixedArea record);
}