package com.logistics.module.service;

import com.logistics.module.dto.DeliveryInfoDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午10:45:11
* 
*/
public interface DeliveryInfoService {
	
	int insertSelective(DeliveryInfoDTO record);
	
	DeliveryInfoDTO selectByPrimaryKey(Integer cId);

}
