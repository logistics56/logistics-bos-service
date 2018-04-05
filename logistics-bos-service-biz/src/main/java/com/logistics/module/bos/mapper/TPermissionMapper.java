package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TPermission;
import com.logistics.module.bos.model.TPermissionExample;
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
    
    List<TPermission> queryAll();
    
    int queryTotal();
    
    List<TPermission> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int queryMaxId();
    
    int deleteSelect(@Param("id") int id);
}