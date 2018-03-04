package com.logistics.module.mapper;

import com.logistics.module.model.TArea;
import com.logistics.module.model.TAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAreaMapper {
    int countByExample(TAreaExample example);

    int insert(TArea record);

    int insertSelective(TArea record);

    List<TArea> selectByExample(TAreaExample example);

    TArea selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByExample(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
}