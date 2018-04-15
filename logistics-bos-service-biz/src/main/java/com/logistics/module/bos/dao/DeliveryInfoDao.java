package com.logistics.module.bos.dao;

import com.logistics.module.bos.model.TDeliveryInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午10:41:59
* 
*/
public interface DeliveryInfoDao {
	
	 int insertSelective(TDeliveryInfo record);
	 
	 TDeliveryInfo selectByPrimaryKey(Integer cId);

}
