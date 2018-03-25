package com.logistics.module.crm.mapper;

import com.logistics.module.crm.model.TCustomer;
import com.logistics.module.crm.model.TCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerMapper {
    int countByExample(TCustomerExample example);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    List<TCustomer> selectByExample(TCustomerExample example);

    TCustomer selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByExample(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);
    
    List<TCustomer> queryByFixedAreaId(@Param("fixedAreaId") String fixedAreaId);
    
    int updateFixedAreaId(@Param("fixedAreaId") String fixedAreaId,@Param("id") int id);
    
    int queryTotalByFixedAreaId(@Param("fixedAreaId") String fixedAreaId);
    
    List<TCustomer> queryByTelephone(@Param("telephone") String telephone);
    
    int updateType(@Param("telephone") String telephone);
}