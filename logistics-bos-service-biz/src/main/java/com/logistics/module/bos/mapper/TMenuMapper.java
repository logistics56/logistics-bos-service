package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TMenu;
import com.logistics.module.bos.model.TMenuExample;

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
    
    int queryTotal();
    
    List<TMenu> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int queryMaxId();
    
    List<TMenu> queryAll();
    
    int deleteSelect(@Param("id") int id);
}