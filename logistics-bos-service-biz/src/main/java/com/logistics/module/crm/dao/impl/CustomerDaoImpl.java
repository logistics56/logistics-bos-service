package com.logistics.module.crm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.crm.dao.CustomerDao;
import com.logistics.module.crm.mapper.TCustomerMapper;
import com.logistics.module.crm.model.TCustomer;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月22日 下午11:12:50
* 
*/
@Component
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	TCustomerMapper tCustomerMapper;

	@Override
	public TCustomer selectByPrimaryKey(Integer cId) {
		return tCustomerMapper.selectByPrimaryKey(cId);
	}

	@Override
	public List<TCustomer> queryByFixedAreaId(String fixedAreaId) {
		return tCustomerMapper.queryByFixedAreaId(fixedAreaId);
	}

	@Override
	public int updateFixedAreaId(String fixedAreaId, int id) {
		return tCustomerMapper.updateFixedAreaId(fixedAreaId, id);
	}

	@Override
	public int queryTotalByFixedAreaId(String fixedAreaId) {
		return tCustomerMapper.queryTotalByFixedAreaId(fixedAreaId);
	}

	@Override
	public List<TCustomer> queryByTelephone(String telephone) {
		return tCustomerMapper.queryByTelephone(telephone);
	}

	@Override
	public int insertSelective(TCustomer record) {
		return tCustomerMapper.insertSelective(record);
	}

	@Override
	public int updateType(String telephone) {
		return tCustomerMapper.updateType(telephone);
	}

	@Override
	public int updateByPrimaryKeySelective(TCustomer record) {
		return tCustomerMapper.updateByPrimaryKeySelective(record);
	}

}
