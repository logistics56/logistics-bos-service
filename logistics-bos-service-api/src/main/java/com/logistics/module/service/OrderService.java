package com.logistics.module.service;

import com.logistics.module.dto.OrderDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 上午11:36:28
* 
*/
public interface OrderService {

	int insertSelective(OrderDTO order);
	
	OrderDTO queryByOrderNum(String orderNum);
}
