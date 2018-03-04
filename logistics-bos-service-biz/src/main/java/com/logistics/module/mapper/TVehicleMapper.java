package com.logistics.module.mapper;

import com.logistics.module.model.TVehicle;
import com.logistics.module.model.TVehicleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVehicleMapper {
    int countByExample(TVehicleExample example);

    int insert(TVehicle record);

    int insertSelective(TVehicle record);

    List<TVehicle> selectByExample(TVehicleExample example);

    TVehicle selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TVehicle record, @Param("example") TVehicleExample example);

    int updateByExample(@Param("record") TVehicle record, @Param("example") TVehicleExample example);

    int updateByPrimaryKeySelective(TVehicle record);

    int updateByPrimaryKey(TVehicle record);
}