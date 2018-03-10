package com.logistics.module.mapper;

import com.logistics.module.model.TWayBill;
import com.logistics.module.model.TWayBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWayBillMapper {
    int countByExample(TWayBillExample example);

    int insert(TWayBill record);

    int insertSelective(TWayBill record);

    List<TWayBill> selectByExample(TWayBillExample example);

    TWayBill selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TWayBill record, @Param("example") TWayBillExample example);

    int updateByExample(@Param("record") TWayBill record, @Param("example") TWayBillExample example);

    int updateByPrimaryKeySelective(TWayBill record);

    int updateByPrimaryKey(TWayBill record);
}