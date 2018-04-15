package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

	@Override
	public List<OrderDTO> queryDisSendAddress(String sendMobile) {
		List<TOrder> results = orderDao.queryDisSendAddress(sendMobile);
		List<OrderDTO> dtos = convertPoToDto(results);
		return dtos;
	}

	@Override
	public List<OrderDTO> queryDisRecAddress(String sendMobile) {
		List<TOrder> results = orderDao.queryDisRecAddress(sendMobile);
		List<OrderDTO> dtos = convertPoToDto(results);
		return dtos;
	}
	
	private List<OrderDTO> convertPoToDto(List<TOrder> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<OrderDTO> targetList = new ArrayList<OrderDTO>();
		for (TOrder po : list) {
			OrderDTO dto = new OrderDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public List<List<OrderDTO>> queryAllStatus(String sendMobile) {
		List<List<OrderDTO>> list = new ArrayList<>(5);
		List<OrderDTO> allList = new ArrayList<>();
		for(int i =1 ; i <=4 ; i++){
			List<TOrder> results = orderDao.queryByTelephoneAndStatus(sendMobile, i+"");
			List<OrderDTO> dtos = convertPoToDto(results);
			if(!CollectionUtils.isEmpty(dtos)){
				allList.addAll(dtos);
			}
			list.add(dtos);
		}
		list.add(allList);//所有订单记录4
		return list;
	}

	@Override
	public OrderDTO selectByPrimaryKey(Integer cId) {
		TOrder po = orderDao.selectByPrimaryKey(cId);
		if(po == null){
			return null;
		}
		OrderDTO dto = new OrderDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

	@Override
	public int updateStatusById(String ststus, int id) {
		return orderDao.updateStatusById(ststus, id);
	}

	@Override
	public int queryTotal() {
		return orderDao.queryTotal();
	}

	@Override
	public List<OrderDTO> queryByPage(int pageNum, int pageSize) {
		List<TOrder> results = orderDao.queryByPage(pageNum, pageSize);
		List<OrderDTO> dtos = convertPoToDto(results);
		return dtos;
	}

	@Override
	public int updateOrderType(String orderType, int courierId, int id) {
		return orderDao.updateOrderType(orderType, courierId, id);
	}

}
