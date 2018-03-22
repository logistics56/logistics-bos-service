package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TStandard;
import com.logistics.module.bos.model.TStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStandardMapper {
    int countByExample(TStandardExample example);

    int insert(TStandard record);

    int insertSelective(TStandard record);

    List<TStandard> selectByExample(TStandardExample example);

    TStandard selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TStandard record, @Param("example") TStandardExample example);

    int updateByExample(@Param("record") TStandard record, @Param("example") TStandardExample example);

    int updateByPrimaryKeySelective(TStandard record);

    int updateByPrimaryKey(TStandard record);
    
    int queryTotal();
    
    List<TStandard> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int queryMaxId();
    
    List<TStandard> queryAll();
}