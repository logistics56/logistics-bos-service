package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TWayBill;
import com.logistics.module.bos.model.TWayBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWayBillMapper {
    int countByExample(TWayBillExample example);

    int insert(TWayBill record);

    int insertSelective(TWayBill record);

    List<TWayBill> selectByExampleWithBLOBs(TWayBillExample example);

    List<TWayBill> selectByExample(TWayBillExample example);

    TWayBill selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TWayBill record, @Param("example") TWayBillExample example);

    int updateByExampleWithBLOBs(@Param("record") TWayBill record, @Param("example") TWayBillExample example);

    int updateByExample(@Param("record") TWayBill record, @Param("example") TWayBillExample example);

    int updateByPrimaryKeySelective(TWayBill record);

    int updateByPrimaryKeyWithBLOBs(TWayBill record);

    int updateByPrimaryKey(TWayBill record);
    
    int queryTotal(@Param("orderNum") String orderNum, @Param("sendAddress") String sendAddress, @Param("recAddress") String recAddress, @Param("sendProNum") String sendProNum, @Param("signStatus") Integer signStatus);
    
    List<TWayBill> queryByPage(@Param("orderNum") String orderNum, @Param("sendAddress") String sendAddress, @Param("recAddress") String recAddress, @Param("sendProNum") String sendProNum, @Param("signStatus") Integer signStatus, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    TWayBill queryByOrderId(@Param("orderId") int orderId);
    
    int updateSignStatus(@Param("id") int id, @Param("signStatus") int signStatus);
    
    List<TWayBill> findWayBills(@Param("orderNum") String orderNum, @Param("sendAddress") String sendAddress, @Param("recAddress") String recAddress, @Param("sendProNum") String sendProNum, @Param("signStatus") Integer signStatus);
}