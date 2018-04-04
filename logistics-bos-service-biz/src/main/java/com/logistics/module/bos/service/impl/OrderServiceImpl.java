package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.OrderDao;
import com.logistics.module.bos.model.TOrder;
import com.logistics.module.dto.OrderDTO;
import com.logistics.module.service.OrderService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 上午11:37:40
* 
*/
@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderDao orderDao;

	@Override
	public int insertSelective(OrderDTO order) {
		if(order == null){
			return 0;
		}
		TOrder po = new TOrder();
		BeanUtils.copyProperties(order, po);
		int num = orderDao.insertSelective(po);
		return num;
	}

	@Override
	public OrderDTO queryByOrderNum(String orderNum) {
		TOrder po = orderDao.queryByOrderNum(orderNum);
		if(po == null){
			return null;
		}
		OrderDTO dto = new OrderDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

}
