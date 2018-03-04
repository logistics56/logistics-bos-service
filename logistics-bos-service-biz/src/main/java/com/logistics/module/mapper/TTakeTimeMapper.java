package com.logistics.module.mapper;

import com.logistics.module.model.TTakeTime;
import com.logistics.module.model.TTakeTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTakeTimeMapper {
    int countByExample(TTakeTimeExample example);

    int insert(TTakeTime record);

    int insertSelective(TTakeTime record);

    List<TTakeTime> selectByExample(TTakeTimeExample example);

    TTakeTime selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TTakeTime record, @Param("example") TTakeTimeExample example);

    int updateByExample(@Param("record") TTakeTime record, @Param("example") TTakeTimeExample example);

    int updateByPrimaryKeySelective(TTakeTime record);

    int updateByPrimaryKey(TTakeTime record);
}