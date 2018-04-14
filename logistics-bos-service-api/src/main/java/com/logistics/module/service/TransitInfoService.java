package com.logistics.module.service;

import com.logistics.module.dto.TransitInfoDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 上午11:43:39
* 
*/
public interface TransitInfoService {
	
	int insertSelective(TransitInfoDTO record);
	
	TransitInfoDTO queryByWayBillId(int wayBillId);

}
