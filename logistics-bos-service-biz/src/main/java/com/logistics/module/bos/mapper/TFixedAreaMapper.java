package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TFixedArea;
import com.logistics.module.bos.model.TFixedAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFixedAreaMapper {
    int countByExample(TFixedAreaExample example);

    int insert(TFixedArea record);

    int insertSelective(TFixedArea record);

    List<TFixedArea> selectByExample(TFixedAreaExample example);

    TFixedArea selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TFixedArea record, @Param("example") TFixedAreaExample example);

    int updateByExample(@Param("record") TFixedArea record, @Param("example") TFixedAreaExample example);

    int updateByPrimaryKeySelective(TFixedArea record);

    int updateByPrimaryKey(TFixedArea record);
    
    int queryTotal();
    
    List<TFixedArea> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    List<TFixedArea> queryMaxId();
    
    List<TFixedArea> queryByKeyword(@Param("keyword") String keyword, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int deleteSelect(@Param("id") String id);
    
    int queryTotalByKeyword(@Param("keyword") String keyword);
}