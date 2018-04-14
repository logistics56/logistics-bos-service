package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.WayBillDao;
import com.logistics.module.bos.mapper.TWayBillMapper;
import com.logistics.module.bos.model.TWayBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月7日 下午8:13:51
* 
*/
@Component
public class WayBillDaoImpl implements WayBillDao {
	
	@Autowired
	TWayBillMapper tWayBillMapper;

	@Override
	public int insertSelective(TWayBill record) {
		return tWayBillMapper.insertSelective(record);
	}

	@Override
	public int queryTotal(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus) {
		return tWayBillMapper.queryTotal(orderNum, sendAddress, recAddress, sendProNum, signStatus);
	}

	@Override
	public List<TWayBill> queryByPage(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus, int pageNum, int pageSize) {
		return tWayBillMapper.queryByPage(orderNum, sendAddress, recAddress, sendProNum, signStatus, pageNum, pageSize);
	}

	@Override
	public TWayBill queryByOrderId(int orderId) {
		return tWayBillMapper.queryByOrderId(orderId);
	}

	@Override
	public int updateSignStatus(int id, int signStatus) {
		return tWayBillMapper.updateSignStatus(id, signStatus);
	}

}
