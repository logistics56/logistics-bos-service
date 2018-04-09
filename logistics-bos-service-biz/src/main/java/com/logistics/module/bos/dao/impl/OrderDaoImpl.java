package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.OrderDao;
import com.logistics.module.bos.mapper.TOrderMapper;
import com.logistics.module.bos.model.TOrder;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 上午11:34:07
* 
*/
@Component
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	TOrderMapper tOrderMapper;

	@Override
	public int insertSelective(TOrder record) {
		return tOrderMapper.insertSelective(record);
	}

	@Override
	public TOrder queryByOrderNum(String orderNum) {
		return tOrderMapper.queryByOrderNum(orderNum);
	}

	@Override
	public List<TOrder> queryDisSendAddress(String sendMobile) {
		return tOrderMapper.queryDisSendAddress(sendMobile);
	}

	@Override
	public List<TOrder> queryDisRecAddress(String sendMobile) {
		return tOrderMapper.queryDisRecAddress(sendMobile);
	}

	@Override
	public List<TOrder> queryByTelephoneAndStatus(String sendMobile, String status) {
		return tOrderMapper.queryByTelephoneAndStatus(sendMobile, status);
	}

	@Override
	public TOrder selectByPrimaryKey(Integer cId) {
		return tOrderMapper.selectByPrimaryKey(cId);
	}

	@Override
	public int updateStatusById(String ststus, int id) {
		return tOrderMapper.updateStatusById(ststus, id);
	}

}
