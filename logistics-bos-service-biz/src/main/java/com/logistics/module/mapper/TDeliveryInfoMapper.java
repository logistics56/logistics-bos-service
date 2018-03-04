package com.logistics.module.mapper;

import com.logistics.module.model.TDeliveryInfo;
import com.logistics.module.model.TDeliveryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeliveryInfoMapper {
    int countByExample(TDeliveryInfoExample example);

    int insert(TDeliveryInfo record);

    int insertSelective(TDeliveryInfo record);

    List<TDeliveryInfo> selectByExample(TDeliveryInfoExample example);

    TDeliveryInfo selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TDeliveryInfo record, @Param("example") TDeliveryInfoExample example);

    int updateByExample(@Param("record") TDeliveryInfo record, @Param("example") TDeliveryInfoExample example);

    int updateByPrimaryKeySelective(TDeliveryInfo record);

    int updateByPrimaryKey(TDeliveryInfo record);
}