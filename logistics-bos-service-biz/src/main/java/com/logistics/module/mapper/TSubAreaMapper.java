package com.logistics.module.mapper;

import com.logistics.module.model.TSubArea;
import com.logistics.module.model.TSubAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSubAreaMapper {
    int countByExample(TSubAreaExample example);

    int insert(TSubArea record);

    int insertSelective(TSubArea record);

    List<TSubArea> selectByExample(TSubAreaExample example);

    TSubArea selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TSubArea record, @Param("example") TSubAreaExample example);

    int updateByExample(@Param("record") TSubArea record, @Param("example") TSubAreaExample example);

    int updateByPrimaryKeySelective(TSubArea record);

    int updateByPrimaryKey(TSubArea record);
}