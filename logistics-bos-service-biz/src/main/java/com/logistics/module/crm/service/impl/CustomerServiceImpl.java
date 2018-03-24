package com.logistics.module.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

	@Override
	public List<CustomerDTO> queryByFixedAreaId(String fixedAreaId) {
		List<TCustomer> pos = customerDao.queryByFixedAreaId(fixedAreaId);
		List<CustomerDTO> dtos = poToDto(pos);
		return dtos;
	}
	
	private List<CustomerDTO> poToDto(List<TCustomer> pos){
		if(CollectionUtils.isEmpty(pos)){
			return null;
		}
		List<CustomerDTO> result = new ArrayList<>();
		for (TCustomer po : pos) {
			CustomerDTO dto = new CustomerDTO();
			BeanUtils.copyProperties(po, dto);
			result.add(dto);
		}
		return result;
	}

	@Override
	public int updateFixedAreaId(String fixesAreaId, int id) {
		return customerDao.updateFixedAreaId(fixesAreaId, id);
	}

}
