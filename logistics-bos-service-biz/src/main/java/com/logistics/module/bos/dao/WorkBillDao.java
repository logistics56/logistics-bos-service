package com.logistics.module.bos.dao;

import java.util.Date;
import java.util.List;

import com.logistics.module.bos.model.TWorkBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:04:11
* 
*/
public interface WorkBillDao {
	
	int insertSelective(TWorkBill record);
	
    int queryNoReceiveTotal(Date date);
    
    List<TWorkBill> queryNoReceiveByPage(int pageNum, int pageSize, Date date);
    
    int queryNoReceiveTotalByCourierId(int courierId, Date date);
    
    List<TWorkBill> queryNoReceiveByPageByCourierId(int courierId, int pageNum, int pageSize, Date date);
    
    int updateState(int id);
    
    TWorkBill queryByOrderId(int orderId);

}
