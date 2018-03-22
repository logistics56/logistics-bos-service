package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TFixedareaCourierExample;
import com.logistics.module.bos.model.TFixedareaCourierKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFixedareaCourierMapper {
    int countByExample(TFixedareaCourierExample example);

    int insert(TFixedareaCourierKey record);

    int insertSelective(TFixedareaCourierKey record);

    List<TFixedareaCourierKey> selectByExample(TFixedareaCourierExample example);

    int updateByExampleSelective(@Param("record") TFixedareaCourierKey record, @Param("example") TFixedareaCourierExample example);

    int updateByExample(@Param("record") TFixedareaCourierKey record, @Param("example") TFixedareaCourierExample example);
}