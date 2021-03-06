package com.logistics.module.bos.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.WorkBillDao;
import com.logistics.module.bos.mapper.TWorkBillMapper;
import com.logistics.module.bos.model.TWorkBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:04:51
* 
*/
@Component
public class WorkBillDaoImpl implements WorkBillDao {
	
	@Autowired
	TWorkBillMapper tWorkBillMapper;

	@Override
	public int insertSelective(TWorkBill record) {
		return tWorkBillMapper.insertSelective(record);
	}

	@Override
	public int queryNoReceiveTotal(Date date) {
		return tWorkBillMapper.queryNoReceiveTotal(date);
	}

	@Override
	public List<TWorkBill> queryNoReceiveByPage(int pageNum, int pageSize, Date date) {
		return tWorkBillMapper.queryNoReceiveByPage(pageNum, pageSize, date);
	}

	@Override
	public int queryNoReceiveTotalByCourierId(int courierId, Date date) {
		return tWorkBillMapper.queryNoReceiveTotalByCourierId(courierId, date);
	}

	@Override
	public List<TWorkBill> queryNoReceiveByPageByCourierId(int courierId, int pageNum, int pageSize, Date date) {
		return tWorkBillMapper.queryNoReceiveByPageByCourierId(courierId, pageNum, pageSize, date);
	}

	@Override
	public int updateState(int id) {
		return tWorkBillMapper.updateState(id);
	}

	@Override
	public TWorkBill queryByOrderId(int orderId) {
		return tWorkBillMapper.queryByOrderId(orderId);
	}

	@Override
	public int queryTotal(int id) {
		return tWorkBillMapper.queryTotal(id);
	}

	@Override
	public List<TWorkBill> queryByPage(int id, int pageNum, int pageSize) {
		return tWorkBillMapper.queryByPage(id, pageNum, pageSize);
	}

	@Override
	public TWorkBill selectByPrimaryKey(Integer cId) {
		return tWorkBillMapper.selectByPrimaryKey(cId);
	}

	@Override
	public int updateCourierId(int courierId, int id) {
		return tWorkBillMapper.updateCourierId(courierId, id);
	}

}
