package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TSubArea;
import com.logistics.module.bos.model.TSubAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSubAreaMapper {
    int countByExample(TSubAreaExample example);

    int insert(TSubArea record);

    int insertSelective(TSubArea record);

    List<TSubArea> selectByExample(TSubAreaExample example);

    TSubArea selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TSubArea record, @Param("example") TSubAreaExample example);

    int updateByExample(@Param("record") TSubArea record, @Param("example") TSubAreaExample example);

    int updateByPrimaryKeySelective(TSubArea record);

    int updateByPrimaryKey(TSubArea record);
    
    int queryTotal();
    
    List<TSubArea> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    List<TSubArea> queryMaxId();
    
    List<TSubArea> queryByKeyword(@Param("keyword") String keyword, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int deleteSelect(@Param("id") String id);
    
    int queryTotalByKeyword(@Param("keyword") String keyword);
    
    List<TSubArea> queryByFixedAreaId(@Param("fixedAreaId") String fixedAreaId);
    
    int queryTotalByFixedAreaId(@Param("fixedAreaId") String fixedAreaId);
}