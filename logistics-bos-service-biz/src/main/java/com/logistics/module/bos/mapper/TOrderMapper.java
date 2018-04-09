package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TOrder;
import com.logistics.module.bos.model.TOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderMapper {
    int countByExample(TOrderExample example);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    List<TOrder> selectByExample(TOrderExample example);

    TOrder selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
    
    TOrder queryByOrderNum(@Param("orderNum") String orderNum);
    
    List<TOrder> queryDisSendAddress(@Param("sendMobile") String sendMobile);
    
    List<TOrder> queryDisRecAddress(@Param("sendMobile") String sendMobile);
    
    List<TOrder> queryByTelephoneAndStatus(@Param("sendMobile") String sendMobile, @Param("status") String status);
    
    int updateStatusById(@Param("ststus") String ststus, @Param("id") int id);
}