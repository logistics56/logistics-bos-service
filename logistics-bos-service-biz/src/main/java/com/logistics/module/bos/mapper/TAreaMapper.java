package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TArea;
import com.logistics.module.bos.model.TAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAreaMapper {
    int countByExample(TAreaExample example);

    int insert(TArea record);

    int insertSelective(TArea record);

    List<TArea> selectByExample(TAreaExample example);

    TArea selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByExample(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
    
    int queryTotal();
    
    List<TArea> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    List<TArea> queryMaxId();
    
    List<TArea> queryByKeyword(@Param("keyword") String keyword, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int deleteSelect(@Param("id") String id);
    
    int queryTotalByKeyword(@Param("keyword") String keyword);
}