package com.logistics.module.mapper;

import com.logistics.module.model.TPermission;
import com.logistics.module.model.TPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPermissionMapper {
    int countByExample(TPermissionExample example);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    List<TPermission> selectByExample(TPermissionExample example);

    TPermission selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TPermission record, @Param("example") TPermissionExample example);

    int updateByExample(@Param("record") TPermission record, @Param("example") TPermissionExample example);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);
}