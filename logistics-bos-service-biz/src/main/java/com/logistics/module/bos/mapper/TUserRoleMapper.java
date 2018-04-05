package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TUserRoleExample;
import com.logistics.module.bos.model.TUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    int countByExample(TUserRoleExample example);

    int insert(TUserRoleKey record);

    int insertSelective(TUserRoleKey record);

    List<TUserRoleKey> selectByExample(TUserRoleExample example);

    int updateByExampleSelective(@Param("record") TUserRoleKey record, @Param("example") TUserRoleExample example);

    int updateByExample(@Param("record") TUserRoleKey record, @Param("example") TUserRoleExample example);
    
    List<TUserRoleKey> selectByUserId(@Param("userId") int userId);
}