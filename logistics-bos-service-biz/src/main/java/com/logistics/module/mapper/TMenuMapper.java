package com.logistics.module.mapper;

import com.logistics.module.model.TMenu;
import com.logistics.module.model.TMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuMapper {
    int countByExample(TMenuExample example);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    List<TMenu> selectByExample(TMenuExample example);

    TMenu selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TMenu record, @Param("example") TMenuExample example);

    int updateByExample(@Param("record") TMenu record, @Param("example") TMenuExample example);

    int updateByPrimaryKeySelective(TMenu record);

    int updateByPrimaryKey(TMenu record);
}