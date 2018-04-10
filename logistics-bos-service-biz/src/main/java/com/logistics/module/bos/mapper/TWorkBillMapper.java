package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TWorkBill;
import com.logistics.module.bos.model.TWorkBillExample;

import java.util.Date;
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
    
    int queryNoReceiveTotal(@Param("date") Date date);
    
    List<TWorkBill> queryNoReceiveByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize, @Param("date") Date date);
    
    int queryNoReceiveTotalByCourierId(@Param("courierId") int courierId, @Param("date") Date date);
    
    List<TWorkBill> queryNoReceiveByPageByCourierId(@Param("courierId") int courierId, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize, @Param("date") Date date);

    int updateState(@Param("id") int id);
}