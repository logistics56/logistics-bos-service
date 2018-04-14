package com.logistics.module.bos.dao;

import com.logistics.module.bos.model.TTransitInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 上午11:39:47
* 
*/
public interface TransitInfoDao {
	
	int insertSelective(TTransitInfo record);
	
	TTransitInfo queryByWayBillId(int wayBillId);

}
