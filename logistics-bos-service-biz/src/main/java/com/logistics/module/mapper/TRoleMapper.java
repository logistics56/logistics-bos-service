package com.logistics.module.mapper;

import com.logistics.module.model.TRole;
import com.logistics.module.model.TRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
    int countByExample(TRoleExample example);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExample(TRoleExample example);

    TRole selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}