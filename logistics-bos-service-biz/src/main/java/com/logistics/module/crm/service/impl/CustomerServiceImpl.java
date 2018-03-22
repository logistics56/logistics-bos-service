package com.logistics.module.crm.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.crm.dao.CustomerDao;
import com.logistics.module.crm.dto.CustomerDTO;
import com.logistics.module.crm.model.TCustomer;
import com.logistics.module.crm.service.CustomerService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月22日 下午11:17:38
* 
*/
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public CustomerDTO selectByPrimaryKey(Integer cId) {
		TCustomer tCustomer = customerDao.selectByPrimaryKey(cId);
		if(tCustomer == null){
			return null;
		}
		CustomerDTO dto = new CustomerDTO();
		BeanUtils.copyProperties(tCustomer, dto);
		return dto;
	}

}
