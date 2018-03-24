package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TVehicle;
import com.logistics.module.bos.model.TVehicleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVehicleMapper {
    int countByExample(TVehicleExample example);

    int insert(TVehicle record);

    int insertSelective(TVehicle record);

    List<TVehicle> selectByExample(TVehicleExample example);

    TVehicle selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TVehicle record, @Param("example") TVehicleExample example);

    int updateByExample(@Param("record") TVehicle record, @Param("example") TVehicleExample example);

    int updateByPrimaryKeySelective(TVehicle record);

    int updateByPrimaryKey(TVehicle record);
    
    int queryTotal();
    
    List<TVehicle> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int queryMaxId();
    
    int deleteSelect(@Param("id") String id);
}