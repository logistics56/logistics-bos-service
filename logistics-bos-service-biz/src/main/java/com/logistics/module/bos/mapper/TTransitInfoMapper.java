package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TTransitInfo;
import com.logistics.module.bos.model.TTransitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTransitInfoMapper {
    int countByExample(TTransitInfoExample example);

    int insert(TTransitInfo record);

    int insertSelective(TTransitInfo record);

    List<TTransitInfo> selectByExample(TTransitInfoExample example);

    TTransitInfo selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TTransitInfo record, @Param("example") TTransitInfoExample example);

    int updateByExample(@Param("record") TTransitInfo record, @Param("example") TTransitInfoExample example);

    int updateByPrimaryKeySelective(TTransitInfo record);

    int updateByPrimaryKey(TTransitInfo record);
    
    TTransitInfo queryByWayBillId(@Param("wayBillId") int wayBillId);
}