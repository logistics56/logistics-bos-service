package com.logistics.module.mapper;

import com.logistics.module.model.TOrder;
import com.logistics.module.model.TOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderMapper {
    int countByExample(TOrderExample example);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByExample(TOrderExample example);

    TOrder selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}