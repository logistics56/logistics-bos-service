package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TTakeTime;
import com.logistics.module.bos.model.TTakeTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTakeTimeMapper {
    int countByExample(TTakeTimeExample example);

    int insert(TTakeTime record);

    int insertSelective(TTakeTime record);

    List<TTakeTime> selectByExample(TTakeTimeExample example);

    TTakeTime selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TTakeTime record, @Param("example") TTakeTimeExample example);

    int updateByExample(@Param("record") TTakeTime record, @Param("example") TTakeTimeExample example);

    int updateByPrimaryKeySelective(TTakeTime record);

    int updateByPrimaryKey(TTakeTime record);
    
    int queryTotal();
    
    List<TTakeTime> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int queryMaxId();
    
    List<TTakeTime> queryAll();
}