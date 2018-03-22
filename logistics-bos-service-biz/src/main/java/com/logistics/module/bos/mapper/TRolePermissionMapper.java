package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TRolePermissionExample;
import com.logistics.module.bos.model.TRolePermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRolePermissionMapper {
    int countByExample(TRolePermissionExample example);

    int insert(TRolePermissionKey record);

    int insertSelective(TRolePermissionKey record);

    List<TRolePermissionKey> selectByExample(TRolePermissionExample example);

    int updateByExampleSelective(@Param("record") TRolePermissionKey record, @Param("example") TRolePermissionExample example);

    int updateByExample(@Param("record") TRolePermissionKey record, @Param("example") TRolePermissionExample example);
}