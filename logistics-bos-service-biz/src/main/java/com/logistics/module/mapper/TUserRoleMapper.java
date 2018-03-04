package com.logistics.module.mapper;

import com.logistics.module.model.TUserRoleExample;
import com.logistics.module.model.TUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    int countByExample(TUserRoleExample example);

    int insert(TUserRoleKey record);

    int insertSelective(TUserRoleKey record);

    List<TUserRoleKey> selectByExample(TUserRoleExample example);

    int updateByExampleSelective(@Param("record") TUserRoleKey record, @Param("example") TUserRoleExample example);

    int updateByExample(@Param("record") TUserRoleKey record, @Param("example") TUserRoleExample example);
}