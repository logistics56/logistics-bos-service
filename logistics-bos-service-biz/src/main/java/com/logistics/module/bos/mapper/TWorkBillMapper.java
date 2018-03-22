package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TWorkBill;
import com.logistics.module.bos.model.TWorkBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWorkBillMapper {
    int countByExample(TWorkBillExample example);

    int insert(TWorkBill record);

    int insertSelective(TWorkBill record);

    List<TWorkBill> selectByExample(TWorkBillExample example);

    TWorkBill selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TWorkBill record, @Param("example") TWorkBillExample example);

    int updateByExample(@Param("record") TWorkBill record, @Param("example") TWorkBillExample example);

    int updateByPrimaryKeySelective(TWorkBill record);

    int updateByPrimaryKey(TWorkBill record);
}