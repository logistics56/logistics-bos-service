package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TRoleMenuExample;
import com.logistics.module.bos.model.TRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMenuMapper {
    int countByExample(TRoleMenuExample example);

    int insert(TRoleMenuKey record);

    int insertSelective(TRoleMenuKey record);

    List<TRoleMenuKey> selectByExample(TRoleMenuExample example);

    int updateByExampleSelective(@Param("record") TRoleMenuKey record, @Param("example") TRoleMenuExample example);

    int updateByExample(@Param("record") TRoleMenuKey record, @Param("example") TRoleMenuExample example);
}